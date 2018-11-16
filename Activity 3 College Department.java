import java.util.*;

public class CollegeDepartment {

   
    public static void main(String[] args) {
        System.out.println("What College department are you in? ");
        Scanner dept = new Scanner(System.in);
        String A = dept.nextLine();
        
        
        
        if (A.equals("CAS")){
            System.out.println("What College Program are you taking?");
        String a = dept.nextLine();
            switch (a) {
                case "Bachelor of Science in Behavorial Science":
                    System.out.println("Your from the College of Arts and Sciences Major in " +a);
                    break;
                case "Bachelor of Arts in Political Science":
                    System.out.println("Your from the College of Arts and Sciences Major in " +a);
                    break;
                case "Bachelor of Arts in Communication":
                    System.out.println("Your from the College of Arts and Sciences Major in " +a);
                    break;
                case "Bachelor of Science in Psychology":
                    System.out.println("Your from the College of Arts and Sciences Major in "+ a);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
                    
                  
            }
        }
             
                if (A.equals("CTE")){
                    System.out.println("What College Program are you taking? ");
                String b = dept.nextLine();
                switch (b) {
                    case "Bachelor of Science in Elementary Education-General":
                        System.out.println("Your from the College of Teacher Education Major in " +b);
                        break;
                    case "Bachelor of Science in Elementary Education":
                        System.out.println("Your from the College of ATeacher Education Major in " +b);
                        break;
                    case "Bachelor of Science in Secondary Education":
                        System.out.println("Your from the College of Teacher Education Major in " +b);
                        break;  
                    default:
                        System.out.println("ERROR");
                    break;
                }  
                }
                if (A.equals("CITCS")){
                    System.out.println("What College Program are you taking? ");
                String c = dept.nextLine();
                switch (c) {
                    case "Bachelor of Science in Information Technology":
                        System.out.println("Your from the College of CITCS Major in " +c);
                        break;
                    case "Bachelor of Science in Computer Science":
                        System.out.println("Your from the College of CITCS Major in " +c);
                        break;
                    case "Bachelor of Science in Data Analytics":
                        System.out.println("Your from the College of CITCS Major in " +c);
                        break;  
                    case "Associate in Computer Technology":
                        System.out.println("Your from the College of CITCS Major in " +c);
                        break;
                    default:
                        System.out.println("ERROR");
                            
                        break;
                  
                        
                }
                
                
                    
        }
        }
 
    }

    
