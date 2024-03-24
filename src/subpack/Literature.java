
package subpack;

public abstract class Literature {
    public String name;
    public String language;
    
    public Literature(String name, String language){
        this.name = name;
        this.language = language;
    }
    
    public String getName() {
        return this.name;
    }
    
}
