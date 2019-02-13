package week2.stock.Stocks;

public enum StockType {
    APPLE,
    IBM,
    ORACLE;

    StockType fromString(String str) {
        return StockType.valueOf(str.toUpperCase());
    }
}
