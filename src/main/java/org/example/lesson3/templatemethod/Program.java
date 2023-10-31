package org.example.lesson3.templatemethod;

public class Program {
    public static  String data = """
            у лукоморья дуб зеленый
            златая цепь на дубе том
            и днем и ночтю кот ученый
            все ходит по цепи кругом
            идет направо песнь заводит
            налево сказку говорит""";

    public static void main(String[] args) {

        LogReader logReader = new PoemReader(data);
        logReader.setCurrentPosition(3);

        for (LogEntry log: logReader.readLogEntry()) {
            System.out.println(log.getText());
        }
    }
}
