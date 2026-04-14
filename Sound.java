class SoundEcho {
    public static void main(String[] args) {
        double speed = 335;
        double totalTime = 7.2;
        double oneWayTime;
        double distance;

        oneWayTime = totalTime / 2;
        distance = oneWayTime * speed;

        System.out.println("Общее время до прихода эхо: " + totalTime + " секунд");
        System.out.println("Время в одну сторону: " + oneWayTime + " секунд");
        System.out.println("Расстояние до объекта: " + distance + " метров");
    }
}