import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import us.magicalash.apcs.wk26.DeadPerson;
import us.magicalash.apcs.wk26.DeadPerson.*;

public class ForensicScience {
    
    public static char[] sexCodes = {'M', 'F', 'E'};
    public static char[] boneCodes = {'F' , 'T', 'H', 'R', 'E'}; 
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog435t.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        DeadPerson[] people = new DeadPerson[12];
        
        System.out.println("Sex Bone Age  Bone Length    Height");
        
        for(int i = 0; i<12; i++){
            char[] letters = input.next().toCharArray();
            Sex code;
            Bone bone;
            int age = 0;
            double boneLength = input.nextDouble();
            
            
            switch (letters[0]){
                case 'M': code = Sex.M; break;
                case 'F': code = Sex.F; break;
                default: code = Sex.I;
            }
            
            switch (letters[1]){
                case 'F': bone = Bone.F; break;
                case 'T': bone = Bone.T; break;
                case 'H': bone = Bone.H; break;
                case 'R': bone = Bone.R; break;
                default: bone = Bone.I;
            }
            
            if(letters.length == 4 && Character.isDigit(letters[2]) && Character.isDigit(letters[3])){
                String num = letters[2] + "" + letters[3];
                age = Integer.parseInt(num);
            }
            
            people[i] = new DeadPerson(code, bone, age, boneLength);
            
            System.out.print(people[i].toString());
            System.out.println("     " + people[i].getHeight());
        }
        
    }
    
    public static int whereMemberInArray(int[] array, int e){
        for(int i = 0; i<array.length-1; i++){
            if (array[i] == e){
                return i;
            }
        }
        return -1;
    }
}
/*
Sex Bone Age  Bone Length    Height
F    H    45    36.266     178.09730399999998
M    F    18    46.967     174.201146
M    H    29    33.309     172.49773
I    F    40    30.078     Inv. Code
M    T    95    36.983     166.25133599999998
M    R    30    23.1768     165.00032
F    F    31    42.55     159.94035
M    I    40    30.0     Inv. Code
F    F    65    39.96     151.89932000000002
F    T    50    30.962     149.798746
F    R    80    19.375     145.59949999999998
M    H    36    24.017     144.54048999999998
*/