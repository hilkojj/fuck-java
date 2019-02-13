package week2.stock.Stocks;

public enum StockType {
    APPLE,
    IBM,
    ORACLE;

    public static StockType fromString(String str) {
        return StockType.valueOf(str.toUpperCase());
    }
}
