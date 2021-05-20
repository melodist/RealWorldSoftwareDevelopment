package main.chapter2;
/*
Simple Bank Transaction Analyzer
Problem
1. 예외를 처리할 수 없음(파일이 비어있음 / 금액을 parsing 할 수 없음 / 행의 데이터가 완벽하지 않음)
2. 입력 읽기, parsing, 결과 처리, 결과 report 기능을 모두 포함하고 있음 -> 단일 책임 원칙 위반
* */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources";

    public static void main(final String... args) throws IOException {

        final Path path = Paths.get(RESOURCES + args[0]);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for(final String line: lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("The total for all transactions is " + total);
    }
}
