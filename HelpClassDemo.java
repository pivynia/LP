class Help {
    void helpOn(int what) {
        switch(what) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                System.out.println("\nПример:");
                System.out.println("if(x > 0)");
                System.out.println("    System.out.println(\"x положительный\");");
                break;
            case '2':
                System.out.println("Традиционный оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("    case константа:");
                System.out.println("        последовательность операторов");
                System.out.println("        break;");
                System.out.println("    // ...");
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
            case '6':
                System.out.println("Оператор break:\n");
                System.out.println("break; или break метка;");
                System.out.println("\nПример:");
                System.out.println("for(int i = 0; i < 10; i++) {");
                System.out.println("    if(i == 5) break;");
                System.out.println("    System.out.println(i);");
                System.out.println("}");
                break;
            case '7':
                System.out.println("Оператор continue:\n");
                System.out.println("continue; или continue метка;");
                System.out.println("\nПример:");
                System.out.println("for(int i = 0; i < 10; i++) {");
                System.out.println("    if(i % 2 == 0) continue;");
                System.out.println("    System.out.println(i);");
                System.out.println("}");
                break;
            default:
                System.out.println("Неизвестный оператор.");
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Справка по:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Выберите вариант (или q для завершения): ");
    }


    boolean isValid(int ch) {
        return (ch >= '1' && ch <= '7') || ch == 'q';
    }
}

class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;
        Help hlpobj = new Help();

        for(;;) {
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');

            } while( !hlpobj.isValid(choice) );

            if(choice == 'q') {
                System.out.println("\nДо свидания!");
                break;
            }

            System.out.println("\n");
            hlpobj.helpOn(choice);
            System.out.println("----------------------------------------\n");
        }
    }
}