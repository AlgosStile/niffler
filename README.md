## **Технологии, использованные в Niffler**

- [Spring Authorization Server](https://spring.io/projects/spring-authorization-server)
- [Spring OAuth 2.0 Resource Server](https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/index.html)
- [Spring data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Web](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#spring-web)
- [Spring actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- [Spring gRPC by https://github.com/yidongnan](https://yidongnan.github.io/grpc-spring-boot-starter/en/server/getting-started.html)
- [Spring web-services](https://docs.spring.io/spring-ws/docs/current/reference/html/)
- [Apache Kafka](https://developer.confluent.io/quickstart/kafka-docker/)
- [Docker](https://www.docker.com/resources/what-container/)
- [Docker-compose](https://docs.docker.com/compose/)
- [Postgres](https://www.postgresql.org/about/)
- [React](https://ru.reactjs.org/docs/getting-started.html)
- [GraphQL](https://graphql.org/)
- [Thymeleaf](https://www.thymeleaf.org/)
- [Jakarta Bean Validation](https://beanvalidation.org/)
- [Jakarta JAXB](https://eclipse-ee4j.github.io/jaxb-ri/)
- [JUnit 5 (Extensions, Resolvers, etc)](https://junit.org/junit5/docs/current/user-guide/)
- [Retrofit 2](https://square.github.io/retrofit/)
- [Allure](https://docs.qameta.io/allure/)
- [Selenide](https://selenide.org/)
- [Selenoid & Selenoid-UI](https://aerokube.com/selenoid/latest/)
- [Allure-docker-service](https://github.com/fescobar/allure-docker-service)
- [Java 21](https://adoptium.net/en-GB/temurin/releases/)
- [Gradle 8.6](https://docs.gradle.org/8.6/release-notes.html)
- [GHA](https://docs.github.com/en/actions)
- [And more...](https://docs.github.com)


**Схема проекта Niffler**

<img src="niffler-diagram.png" width="600">

# Минимальные предусловия для работы с проектом Niffler

#### Если у вас ОС Windows

Во-первых, и в-главных, необходимо использовать bash terminal, а не powershell.
Во-вторых, для запуска фронтенда локально необходимо использовать команду
`npm run build:windows`, если не работает стандартная команда `npm run build:dev`

PS. После успешного запуска, мы заходим НЕ сюда: `http://localhost:3000` а вот сюда
`http://127.0.0.1:3000` !!! Это важно, иначе не будет работать авторизация!


#### 1. Установить docker (Если не установлен)

В этом проекте используется docker для БД (Postgres).
Запускаются микросервисы в едином docker network при
помощи docker-compose

[Установка на Windows](https://docs.docker.com/desktop/install/windows-install/)

[Установка на Mac](https://docs.docker.com/desktop/install/mac-install/) (Для ARM и Intel разные пакеты)

[Установка на Linux](https://docs.docker.com/desktop/install/linux-install/)

После установки и запуска docker daemon необходимо убедиться в работе команд docker, например `docker -v`:

```posh
% docker -v
Docker version 26.1.1, build 4cf5afa

```

#### 2. Спуллить(pull) контейнер postgres:15.1, zookeeper и kafka версии 7.3.2

```posh
docker pull postgres:15.1
docker pull confluentinc/cp-zookeeper:7.3.2
docker pull confluentinc/cp-kafka:7.3.2
```

После `pull` вы увидите спуленный image командой `docker images`

```posh
mitriis-MacBook-Pro ~ % docker images            
REPOSITORY                 TAG              IMAGE ID       CREATED         SIZE
postgres                   15.1             9f3ec01f884d   10 days ago     379MB
confluentinc/cp-kafka      7.3.2            db97697f6e28   12 months ago   457MB
confluentinc/cp-zookeeper  7.3.2            6fe5551964f5   7 years ago     451MB

```

#### 3. Создать volume для сохранения данных из БД в docker на вашем компьютере

```posh
docker volume create pgdata
```

#### 4. Запустить БД, zookeeper и kafka 3-мя последовательными командами:

Запустив скрипт (Для Windows необходимо использовать bash terminal: gitbash, cygwin или wsl)

```posh
niffler % bash localenv.sh
```

Или выполнив последовательно команды, для *nix:

```posh
docker run --name niffler-all -p 5432:5432 -e POSTGRES_PASSWORD=admin -v pgdata:/var/lib/postgresql/data -d postgres:15.1

docker run --name=zookeeper -e ZOOKEEPER_CLIENT_PORT=2181 -p 2181:2181 -d confluentinc/cp-zookeeper:7.3.2

docker run --name=kafka -e KAFKA_BROKER_ID=1 \
-e KAFKA_ZOOKEEPER_CONNECT=$(docker inspect zookeeper --format='{{ .NetworkSettings.IPAddress }}'):2181 \
-e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 \
-e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 \
-e KAFKA_TRANSACTION_STATE_LOG_MIN_ISR=1 \
-e KAFKA_TRANSACTION_STATE_LOG_REPLICATION_FACTOR=1 \
-p 9092:9092 -d confluentinc/cp-kafka:7.3.2
```

Для Windows (Необходимо использовать bash terminal: gitbash, cygwin или wsl):

```posh
docker run --name niffler-all -p 5432:5432 -e POSTGRES_PASSWORD=admin -v pgdata:/var/lib/postgresql/data -d postgres:15.1

docker run --name=zookeeper -e ZOOKEEPER_CLIENT_PORT=2181 -p 2181:2181 -d confluentinc/cp-zookeeper:7.3.2

docker run --name=kafka -e KAFKA_BROKER_ID=1 -e KAFKA_ZOOKEEPER_CONNECT=$(docker inspect zookeeper --format='{{ .NetworkSettings.IPAddress }}'):2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 -e KAFKA_TRANSACTION_STATE_LOG_MIN_ISR=1 -e KAFKA_TRANSACTION_STATE_LOG_REPLICATION_FACTOR=1 -p 9092:9092 -d confluentinc/cp-kafka:7.3.2
```

https://github.com/confluentinc/cp-docker-images/issues/801#issuecomment-692085103

#### 5. Установить одну из программ для визуальной работы с Postgres

Например, бесплатную PgAdmin 4.

#### 6. Подключиться к БД postgres (host: localhost, port: 5432, user: postgres, pass: admin, database name: postgres) 
#### из PgAdmin и создать пустые БД микросервисов
#### Во избежание возможных конфликтов, рекомендую создавать каждую БД по отдельности!

```sql
create
    database "niffler-userdata" with owner postgres;
create
    database "niffler-spend" with owner postgres;
create
    database "niffler-currency" with owner postgres;
create
    database "niffler-auth" with owner postgres;
```

#### 7. Установить Java версии не ниже 17, но рекомендую 21. 
#### На проекте используется синтаксис Java 21!

Версию установленной Java необходимо проверить командой `java -version`

```posh
% java -version

Терминал должен выдать:
______________________
openjdk version "21.0.1" 2023-10-17 LTS
OpenJDK Runtime Environment Temurin-21.0.1+12 (build 21.0.1+12-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.1+12 (build 21.0.1+12-LTS, mixed mode)
```

Если у вас несколько версий Java одновременно - то хотя бы одна из них должна быть 21
Если java не установлена вовсе, то рекомендую установить OpenJDK (например,
из https://adoptium.net/en-GB/temurin/releases/)

#### 8. Установить пакетый менеджер для сборки front-end npm

[Инструкция](https://docs.npmjs.com/downloading-and-installing-node-js-and-npm).
Рекомендованная версия Node.js - 21.0 (LTS)

# Запуск Niffler локальное в IDE:

#### 1. Выбрать какой фронтенд предполагается запускать - REST или GraphQL, и перейти в соответсвующий каталог

для REST:

```posh
% cd niffler-frontend
```

или для GraphQL:

```posh
% cd niffler-frontend-gql
```

#### 2. Запустить фронтенд (сначала обновить зависимости)

Для *nix:

```posh
niffler-frontend % npm i
niffler-frontend % npm run build:dev
```

Для Windows:

```posh
% npm i
npm run build:windows
```

#### 3. Прописать run конфигурацию для всех сервисов niffler-* - Active profiles local

Для этого зайти в меню Run -> Edit Configurations -> выбрать main класс -> указать Active profiles: local
[Инструкция](https://stackoverflow.com/questions/39738901/how-do-i-activate-a-spring-boot-profile-when-running-from-intellij).

#### 4 Запустить сервис Niffler-auth c помощью gradle или командой Run в IDE:

- Запустить сервис auth

```posh
cd niffler-auth
niffler-auth % gradle bootRun --args='--spring.profiles.active=local'
```

Или просто перейдя к main-классу приложения NifflerAuthApplication выбрать run в IDEA (предварительно удостовериться,
что выполнен предыдущий пункт).

#### 5  Запустить в любой последовательности другие сервисы: 
#### niffler-currency; 
#### niffler-spend; 
#### niffler-gateway; 
#### niffler-userdata.

# Запуск Niffler в докере:

#### 1. Создать бесплатную учетную запись на https://hub.docker.com/ (если отсутствует)

#### 2. Создать в настройках своей учетной записи access_token

[Инструкция](https://docs.docker.com/docker-hub/access-tokens/).

#### 3. Выполнить docker login с созданным access_token (в инструкции это описано)

#### 4. Прописать в etc/hosts элиас для Docker-имени

- frontend:  127.0.0.1 frontend.niffler.dc,
- auth:      127.0.0.1 auth.niffler.dc
- gateway:   127.0.0.1 gateway.niffler.dc

```posh
niffler % vi /etc/hosts
```

```posh
##
# Host Database
#
# localhost is used to configure the loopback interface
# when the system is booting.  Do not change this entry.
##
127.0.0.1       localhost
127.0.0.1       frontend.niffler.dc
127.0.0.1       auth.niffler.dc
127.0.0.1       gateway.niffler.dc
```

#### 5. Перейти в корневой каталог проекта

```posh
niffler % cd niffler
```

#### 6. Запустить все сервисы, если необходим фронтенд GraphQL, то это указывается аргументом к скрипту:

для REST:

```posh
niffler % bash docker-compose-dev.sh
```

для GraphQL:

```posh
niffler % bash docker-compose-dev.sh gql
```

Текущая версия `docker-compose-dev.sh` **удалит все запущенные Docker контейнеры в системе**, 
поэтому если у вас есть созданные контейнеры для других проектов
то отредактируйте строку ```posh docker rm $(docker ps -a -q)```, чтобы включить в grep
только те контейнеры, что непосредственно относятся к niffler.

Niffler при запуске в докере будет работать для вас по адресу http://frontend.niffler.dc:80, этот порт НЕ НУЖНО
указывать в браузере, таким образом переходить напрямую по ссылке http://frontend.niffler.dc

Если при выполнении скрипта вы получили ошибку

```
* What went wrong:
Execution failed for task ':niffler-auth:jibDockerBuild'.
> com.google.cloud.tools.jib.plugins.common.BuildStepsExecutionException: 
Build to Docker daemon failed, perhaps you should make sure your credentials for 'registry-1.docker.io...
```

То необходимо убедиться, что в `$USER/.docker/config.json` файле отсутствует запись `"credsStore": "desktop"`
При наличии такого ключа в json, его надо удалить.
Если файл пустой, то возможно не выполнен `docker login`. Если выполнялся, то надо создать файл руками по
пути `$USER/.docker/config.json`
с содержимым:

```
 {
        "auths": {
                "https://index.docker.io/v1/": {}
        },
        "currentContext": "desktop-linux"
}
```

# Создание своего docker repository Niffler и сборки своих докер контейнеров

#### 1. Войти в свою УЗ на https://hub.docker.com/ и последовательно создать публичные репозитории

- niffler-auth
- niffler-currency
- niffler-frontend
- niffler-frontend-gql
- niffler-gateway
- niffler-spend
- niffler-userdata


Допустим, что ваш username на https://hub.docker.com - *algosstile*

#### 2. заменить в файле docker.properties (в корне проекта) IMAGE_PREFIX=qaguru на IMAGE_PREFIX=algosstile

- где algosstile - ваш юзернэйм на https://hub.docker.com/

#### 3. заменить в файле build.gradle (в корне проекта) dockerHubName = "qaguru" на dockerHubName = "algosstile"

- где algosstile - ваш юзернэйм на https://hub.docker.com/

#### 4. Перейти в корневой каталог проекта

```posh
niffler % cd niffler
```

#### 5. Собрать все имеджи, запушить и запустить niffler одной командой, если необходим фронтенд GraphQL, 
#### то это указывается аргументом к скрипту:

для REST:

```posh
niffler % bash docker-compose-dev.sh push
```

для GraphQL:

```posh
niffler % bash docker-compose-dev.sh gql push
```

# Запуск e-2-e тестов в Docker network изолированно Niffler в докере:

#### 1. Перейти в корневой каталог проекта

```posh
% cd niffler
```

#### 2. Запустить все сервисы и тесты, если необходим фронтенд GraphQL, то это указывается аргументом к скрипту:

для REST:

```posh
niffler % bash docker-compose-e2e.sh
```

для GraphQL:

```posh
niffler % bash docker-compose-e2e.sh gql
```

#### 3. Selenoid UI доступен по адресу: http://localhost:9090/

#### 4. Allure доступен по адресу: 
#### http://localhost:5050/allure-docker-service/projects/niffler-e-2-e-tests/reports/latest/index.html

#### UPD. После сборки вы можете увидеть в терминале следующее сообщение: 
`DEPRECATED: The legacy builder is deprecated and will be removed in a future release.
            Install the buildx component to build images with BuildKit:
            https://docs.docker.com/go/buildx/ `
Это говорит о том, что вскоре
используемый метод сборки образов Docker deprecated - будет удален в будущих версиях. 
Вам рекомендуется установить компонент buildx для сборки образов с использованием BuildKit, который является 
более новым и эффективным инструментом сборки.

#### Решение:
Нужно скачать с github `buildx` по этой ссылке: https://github.com/docker/buildx/releases/tag/v0.15.0
Скачанный файл положить по пути C:\Program Files\Docker\cli-plugins далее docker сам сделает оставшуюся работу за вас!


