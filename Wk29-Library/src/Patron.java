

/**
 * A simple class to manage Patrons.
 * @author wroge7934
 *
 */
public class Patron{
    private Media media;
    private String name;
    
    /**
     * Creates a Patron object
     * @param media  The media to be used.
     * @param name  The Name of the patron.
     */
    public Patron(Media media, String name){
        this.media = media;
        this.name = name;
    }
    
    /**
     * Creates an empty patron object. Use at your own risk.
     */
    public Patron(){ //May return null if not properly set
        this.media = null;
        this.name = null;
    }
    
    /**
     * Creates a Patron object with no name. Use at your own risk.
     * @param media  The media to be used.
     */
    public Patron(Media media){
        this.media = media;
        this.name = null;
    }
    
    /**
     * Creates a Patron object with no media. Use at your own risk.
     * @param name
     */
    public Patron(String name){
        this.name = name;
        this.media = null;
    }
    
    /**
     * Sets the name of a Patron Object
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Sets the media of a Patron Object
     * @param media
     */
    public void setMedia(Media media){
        this.media = media;
    }
    
    /**
     * Gets the name of the patron.
     * @return
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Gets the media of the patron.
     * @return
     */
    public Media getMedia(){
        return this.media;
    }
    
    /**
     * Turns the object into a string.
     */
    @Override
    public String toString(){
        return this.name + " has taken out the media " + this.media.getTitle() + ".";
    }
    
}
