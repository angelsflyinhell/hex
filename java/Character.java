public class Character {
    private String role;
    private String username;
    private int joinIndex;
    private String color;
    private String[] cosmetics;
    private boolean evil;

    private String[] position;

    public Character(String role, String username, int joinIndex, String color, String[] cosmetics, boolean evil) {
        this.role = role;
        this.username = username;
        this.joinIndex = joinIndex;
        this.color = color;
        this.cosmetics = cosmetics;
        this.evil = evil;
        this.position = {0, 0, 0};
    }

    public void moveToVector3(int x, int y, int z) {
        position = {x, y, z};
        System.out.println("Player " + username + " moved to X: " + x + " Y: " + y + " Z: " + z);
    }
}