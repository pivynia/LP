class Help2 {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;
        char continueChoice;

        do {
            do {
                System.out.println("Справка по:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while\n");
                System.out.print("Выберите вариант: ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');

            } while(choice < '1' || choice > '5');

            System.out.println("\n");

            switch(choice) {
                case '1':
                    System.out.println("Оператор if:\n");
                    System.out.println("if(условие) оператор;");
                    System.out.println("else оператор;");
                    System.out.println("\nПример:");
                    System.out.println("if(x > 0)");
                    System.out.println("    System.out.println(\"x положительный\");");
                    System.out.println("else");
                    System.out.println("    System.out.println(\"x отрицательный или ноль\");");
                    break;
                case '2':
                    System.out.println("Традиционный оператор switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println("    case константа:");
                    System.out.println("        последовательность операторов");
                    System.out.println("        break;");
                    System.out.println("    // ...");
                    System.out.println("}");
                    System.out.println("\nПример:");
                    System.out.println("switch(day) {");
                    System.out.println("    case 1:");
                    System.out.println("        System.out.println(\"Понедельник\");");
                    System.out.println("        break;");
                    System.out.println("    case 2:");
                    System.out.println("        System.out.println(\"Вторник\");");
                    System.out.println("        break;");
                    System.out.println("    default:");
                    System.out.println("        System.out.println(\"Другой день\");");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.print("for(инициализация; условие; итерация)");
                    System.out.println(" оператор;");
                    System.out.println("\nПример:");
                    System.out.println("for(int i = 0; i < 10; i++)");
                    System.out.println("    System.out.println(i);");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println("while(условие) оператор;");
                    System.out.println("\nПример:");
                    System.out.println("int i = 0;");
                    System.out.println("while(i < 10) {");
                    System.out.println("    System.out.println(i);");
                    System.out.println("    i++;");
                    System.out.println("}");
                    break;
                case '5':
                    System.out.println("Цикл do-while:\n");
                    System.out.println("do {");
                    System.out.println("    оператор;");
                    System.out.println("} while (условие);");
                    System.out.println("\nПример:");
                    System.out.println("int i = 0;");
                    System.out.println("do {");
                    System.out.println("    System.out.println(i);");
                    System.out.println("    i++;");
                    System.out.println("} while(i < 10);");
                    break;
            }

            System.out.println("\n----------------------------------------");
            System.out.print("Показать другую справку? (y/n): ");

            continueChoice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');

            System.out.println();

        } while(continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("До свидания! Спасибо за использование справочной системы.");
    }
}