//package basic;

class LuasLingkaran {
    public int a; // Jari-jari
    public int b; // Jari-jari (untuk kasus perhitungan luas lingkaran)
    public float luas;

    // Konstruktor dengan parameter
    public LuasLingkaran(int a, int b) {
        this.a = a;
        this.b = b;
        this.luas = (float) (3.14 * a * b); // Menghitung luas
    }
}