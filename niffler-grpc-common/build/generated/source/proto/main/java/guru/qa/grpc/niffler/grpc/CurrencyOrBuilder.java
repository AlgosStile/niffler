// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: niffler-currency.proto

package guru.qa.grpc.niffler.grpc;

public interface CurrencyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:guru.qa.grpc.niffler.Currency)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.guru.qa.grpc.niffler.CurrencyValues currency = 1;</code>
   * @return The enum numeric value on the wire for currency.
   */
  int getCurrencyValue();
  /**
   * <code>.guru.qa.grpc.niffler.CurrencyValues currency = 1;</code>
   * @return The currency.
   */
  guru.qa.grpc.niffler.grpc.CurrencyValues getCurrency();

  /**
   * <code>double currencyRate = 2;</code>
   * @return The currencyRate.
   */
  double getCurrencyRate();
}
