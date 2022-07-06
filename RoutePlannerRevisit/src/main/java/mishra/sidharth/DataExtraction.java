package mishra.sidharth;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DataExtraction {

    List<Routes> flightList = new ArrayList<>();

    public List<Routes> getInformation()
    {
        File f = new File("C:\\Users\\mishr\\IdeaProjects\\RoutePlannerRevisit\\src\\main\\java\\mishra\\sidharth\\Data.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(f)))
        {
           // br.readLine();
            int i = 0;
            String temp;
            while ((temp = br.readLine()) != null)
            {
                String[] routesarray = temp.split(",");
                String city1 = routesarray[0].trim();
                String city2 = routesarray[1].trim();
                String flightno = String.valueOf(routesarray[2].trim());
                String time = routesarray[3].trim();
                String price = routesarray[4].trim();
                flightList.add(new Routes(city1,city2,flightno,time,price));
                i++;


            }
        }
        catch(Exception z)
        {
            System.out.println("hello every one i handled java expection (*_*)");
        }


        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-All Listed flights*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(String.format("%20s  %20s %25s %30s %30s", "From", "To", "Distance in Km", "Travel Time", "Airfare"));


       for(Routes x :flightList){
           System.out.println(x);
       }
        return flightList;
    }
}
