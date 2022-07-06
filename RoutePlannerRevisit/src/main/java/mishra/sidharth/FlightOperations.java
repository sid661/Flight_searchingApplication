package mishra.sidharth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightOperations {



    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Direct Flight-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*//

    public List<Routes> directFlight(List<Routes> flightData, String searchCity)
    {
        List<Routes> directFlight;
        directFlight = flightData.stream().filter(x -> x.getCity1().equalsIgnoreCase(searchCity)).collect(Collectors.toList());
        return directFlight;
    }


    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Sorted Flight*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*//

    public List<Routes> sortingAlphabetically(List<Routes> availableFlights)
    {
        Collections.sort(availableFlights, (p1, p2) -> p1.getCity2().compareToIgnoreCase(p2.getCity2()));

        return availableFlights;
    }





    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Direct Flight*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*//

    public List<Routes> availableDirect(List<Routes> availableFlights,String searchCity, String destinationCity)
    {
        List<Routes> availbleDirectFlight;
        availbleDirectFlight=availableFlights.stream().filter(x->(x.getCity1().equalsIgnoreCase(searchCity))&&(x.getCity2().equalsIgnoreCase(destinationCity))).collect(Collectors.toList());
        return availbleDirectFlight;
    }


    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Connecting Flight*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*//


    public void connectingFlight(List<Routes> connectingFlights, String searchCity,String destionationCity)
    {
        connectingFlights.forEach(z->
                { String tempcity1 = z.getCity2();
                if(z.getCity1().trim().equalsIgnoreCase(searchCity) && ! (z.getCity2().trim().equalsIgnoreCase(destionationCity))){
                    connectingFlights.stream().filter(k-> k.getCity1().equalsIgnoreCase(tempcity1)&& k.getCity2().trim().
                            equalsIgnoreCase(destionationCity)).forEach(x-> System.out.format("\n%20s  %20s %25s %30s %30s\"\n%20s  %20s %25s %30s %30s",
                            z.getCity1(), z.getCity2(), z.getFlightno(), z.getTime(),z.getPrice(),
                            x.getCity1(), x.getCity2(), x.getFlightno(), x.getTime(), x.getPrice()));
                } });

    }


}
//*******************************************************************************************************************************************//