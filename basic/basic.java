public class basic {
    // Static method
    static void thisStatic() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void thisPublic() {
        System.out.println("Public methods can be called without creating objects");
    }

    public static void main(String[] args) {
        thisStatic();


        // thisPublic(); it would compile an error, BECAUSE IT HAS NO OBJECT.
    }
}

