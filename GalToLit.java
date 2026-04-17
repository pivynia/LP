class GalToLit {
    public static void main(String[] args) {
        // объявляем переменные
        double gallons;  // хранит количество галлонов
        double liters;   // хранит результат преобразования в литры

        gallons = 25;    // начать с 10 галлонов
        liters = gallons * 3.7854;  // преобразование в литры

        System.out.println(gallons + " галлонов соответствует "
                + liters + " литрам.");
    }
}