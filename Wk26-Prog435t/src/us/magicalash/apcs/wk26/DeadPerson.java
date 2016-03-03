package us.magicalash.apcs.wk26;
/**
 * A small, final class to handle dead people.
 * @author wroge7934
 *
 */
public final class DeadPerson {
    
    public static enum Sex {M, F, I}
    public static enum Bone {F, T, H, R, I}
    private final Sex sex;
    private final Bone bone;
    private final int age;
    private final double boneSize;
    
    /**
     * Creates a dead person. How morbid.
     * @param s         The sex of the dead person.
     * @param b         The bone being used to determine height
     * @param age       The age of the person.
     * @param boneSize  The length of the bone being used.
     */
    public DeadPerson(Sex s, Bone b, int age, double boneSize){
        sex = s;
        bone = b;
        this.age = age;
        this.boneSize = boneSize;
    }
    
    /**
     * Gets the height of the dead person using science.
     * @return The height of the dead person.
     */
    public Object getHeight(){
        Object height = 0;
        if (sex == Sex.I || bone == Bone.I){
            height = "Inv. Code";
        } else if(sex == DeadPerson.Sex.F){ 
            switch (bone){
                case F: height = new Double(61.412 + 2.317 * boneSize); break;
                case T: height = new Double(72.572 + 2.533 * boneSize); break;
                case H: height = new Double(64.977 + 3.144 * boneSize); break;
                case R: height = new Double(73.502 + 3.876 * boneSize); break;
                default: break; //Something bad happened!
            }
        } else if(sex == DeadPerson.Sex.M){
            switch (bone){
                case F: height = new Double(69.089 + 2.238 * boneSize); break;
                case T: height = new Double(81.688 + 2.392 * boneSize); break;
                case H: height = new Double(73.570 + 2.970 * boneSize); break;
                case R: height = new Double(80.405 + 3.650 * boneSize); break;
                default: break; //This should never get hit.
            }
        }
        
        if (this.age > 30 && sex != Sex.I && bone != Bone.I){ //Account for shrinking
            height = ((Double) height) - 0.06*(this.age-30);
        }
        
        return height;
    }
    
    public String toString(){
        return sex + "    " + bone + "    " + age + "    " + boneSize;
    }
    
}
