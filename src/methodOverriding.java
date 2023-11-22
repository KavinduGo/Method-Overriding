class methodOverriding {
    void gain() {
        System.out.println("Growing");
    }
}
class Mango extends methodOverriding {
    void gain(){
        System.out.println("Growing Slow ]");
    }

    public static void main(String[] args) {
        Mango m = new Mango();
        m.gain();
    }

}
