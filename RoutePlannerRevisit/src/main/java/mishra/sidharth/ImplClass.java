package mishra.sidharth;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ImplClass
{
    public static void main(String[] args)
    {


        Routes routes = new Routes();




        DataExtraction dataExtraction = new DataExtraction();
        List<Routes> flightData = dataExtraction.getInformation();


        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("*-PLEASE-*-ENTER-*-THE-*-SOURCE-*-CITY-*");
        System.out.println();
        String searchCity= scanner.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--PLEASE-*-ENTER-*-THE-*-DESTINATION-*-CITY-*");
        System.out.println();
        String destinationCity= scanner.nextLine();


        System.out.println("*-YOUR-*-SOURCE-*-CITY-*-IS-*  "+"-------------------->"+searchCity);
        System.out.println();
        System.out.println("*-PLEASE-*-DESTINATION-*-CITY-*"+"------------------->"+destinationCity);
        System.out.println();



        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*Avalable flights*-*-*-*-*-*-*-*-*-**-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(String.format("%20s  %20s %25s %30s %30s","*-*-*-*FROM*-*-*-*-*-*","*-*-*-*-*T0*-*-*-*-*","*-*-*-*-*DISTANCE IN KM*-*-*-*-*","*-*-*-*-*TRAVEL TIME*-*-*-*-*-*-*-*-*-*-*","*-*-*AIR FARE-*-*-*-*-*-*-*-*-*-*"));
        FlightOperations flightOperations = new FlightOperations();
        List<Routes> avilableFlights=flightOperations.directFlight(flightData,searchCity);
        avilableFlights.forEach(y-> System.out.println(y));



        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*FLIGHTS SORTED ALPHABETICALLY*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(String.format("%20s  %20s %25s %30s %30s","*-*-*-*FROM*-*-*-*-*-*","*-*-*-*-*T0*-*-*-*-*","*-*-*-*-*DISTANCE IN KM*-*-*-*-*","*-*-*-*-*TRAVEL TIME*-*-*-*-*-*-*-*-*-*-*","*-*-*AIR FARE-*-*-*-*-*-*-*-*-*-*"));
        List<Routes> sortedflights =flightOperations.sortingAlphabetically(avilableFlights);
        sortedflights.forEach(x-> System.out.println(x));




        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-AVAILABLE DIRECT FLIGHTS-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(String.format("%20s  %20s %25s %30s %30s","*-*-*-*FROM*-*-*-*-*-*","*-*-*-*-*T0*-*-*-*-*","*-*-*-*-*DISTANCE IN KM*-*-*-*-*","*-*-*-*-*TRAVEL TIME*-*-*-*-*-*-*-*-*-*-*","*-*-*AIR FARE-*-*-*-*-*-*-*-*-*-*"));
        List<Routes> availableDirectFlights = flightOperations.availableDirect(flightData,searchCity,destinationCity);
        availableDirectFlights.forEach(z-> System.out.println(z));
        System.out.println();
        if(availableDirectFlights.size()==0){
            System.out.println("------------------------------------SORRY FOR YOUR INCONVENIENCE WE DONOT HAVE DIRECT FLIGHT FROM"+ "  "+searchCity +" to "+ destinationCity+"-----------------------------");
        }

        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-CONNECTING FLIGHTS-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(String.format("%20s  %20s %25s %30s %30s","*-*-*-*FROM*-*-*-*-*-*","*-*-*-*-*T0*-*-*-*-*","*-*-*-*-*DISTANCE IN KM*-*-*-*-*","*-*-*-*-*TRAVEL TIME*-*-*-*-*-*-*-*-*-*-*","*-*-*AIR FARE-*-*-*-*-*-*-*-*-*-*"));
        flightOperations.connectingFlight(flightData,searchCity,destinationCity);

    }

}
