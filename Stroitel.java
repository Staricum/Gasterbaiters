import java.util.ArrayList;

/////Roof/////
class Roof {
    public String name;
    private String material;
    
    public Roof(String material) {
        this.material = material; 
        this.name = "Krisha gotova nachalnike" + material;
    }
    
    public void setName(String name) { 
        this.name = name;
    }
    
    public  String toString() {
        return this.name;
        
    }
}

/////Wall/////
class Wall {
    public String name;
    private String material;

    public Wall(String material) {
        this.material = material;
        this.name = "Stenke zashtukaturil nachalnike" + material;
}

    public void setName(String name) {
        this.name = name;
}

    public  String toString() {
        return this.name;
        
    }
}

/////Window/////
class Window {
    public String name;
    private String material;

    public Window(String material) {
        this.material = material;
        this.name = "Steklakapet sdelal nachalnike" + material;
}

    public void setName(String name) {
        this.name = name;
}

    public String toString() {
        return this.name;
    }
}

/////InteriorWall:Wall/////
class InteriorWall extends Wall {
    public InteriorWall(String material) {
        super(material);
        this.name = "Stenke ablicovke gatove nachalnike" + material;
    }
}

/////houseType/////
enum houseType {
   WOOD, GINGERBREAD, STONE
}

/////HouseBuilder/////
abstract class HouseBuilder {
    protected String builderName;
    
    private houseType houseType;
    protected House house = new House();
    
    public void sethouseType(houseType houseType) {
        this.houseType = houseType;
        house.sethouseType(houseType);
    }
    
public abstract HouseBuilder addWalls();
public abstract HouseBuilder addRoof();
public abstract HouseBuilder addWindows();

public House build() {
    System.out.println("Startuem stroit hatu!");
    return house;
    }
}

/////StoneHouseBuilder/////
class StoneHouseBuilder extends HouseBuilder {
    int numWalls = 5;
    int numWindows = 20;
    String windowMaterial = "Antique glass";
    String wallMaterial = "Stone, 2 feet thick";
    String interiorWallMaterial = "Stone, 1 foot thick";
    String roofMaterial = "Tile";
    
    public StoneHouseBuilder() {
        this.builderName = "Sone House Builder";
        sethouseType(houseType.STONE);
    }
    
    public HouseBuilder addWalls() {
        for (int i = 0; i < numWalls - 1; i++) {
        house.addWall(new Wall (wallMaterial));
    }

        house.addWall(new Wall(interiorWallMaterial));
        
        return this;
    }
    public HouseBuilder addRoof() {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }
    
    public HouseBuilder addWindows() {
        for (int i = 0; i < numWindows; i++) {
        house.addWindow(new Window(windowMaterial));
    }
    
    return this;
}
   
    public House build() { 
         System.out.println("Vi cho postroili idioti?");
         return house;
    }
}

/////House/////
class House {
    Roof roof;
    ArrayList<Wall>walls;
    ArrayList<Window>windows;
    houseType houseType;
    String name;
    
    public House() {
        this.walls = new ArrayList<Wall>();
        this.windows = new ArrayList<Window>();
    }
    
    public House sethouseType(houseType houseType) {
        this.houseType = houseType;
        
        switch (houseType) {
            case STONE: this.name = "Moi kammeniy hata"; break;
        }
        
        return this;
    }
    
    public House addRoof(Roof roof) {
        this.roof = roof;
        return this;
        
    }
    
    public House addWall(Wall wall) {
        this.wall = wall;
        return this;
    }
    
    public House addWindow(Window window) {
        this.window = window;
        return this;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        String display = "";
        display += "--- " + this.name + " ---\n";
        for(Wall wall : walls) {
            display += "--- " + wall.name + " ---\n";
        }
        for(Window window : windows) {
            display += "--- " + window.name + " ---\n";
        }
        display += "--- " + roof.name + " ---\n";
        return display;
    }
}

public class Main
{
    public static void main (String args) {
        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        House stoneHouse = stoneHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(stoneHouse.toString());
    } 
}