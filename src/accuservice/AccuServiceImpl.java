package accuservice;

import accuproducer.*;

import javax.jws.WebService;

/**
 * Created by Cindy on 10-3-2017.
 */

@WebService( endpointInterface= "accuproducer.AccuServiceInterface")
public class AccuServiceImpl implements AccuServiceInterface {

    @Override
    public AccuResponse calculateAccuPercentage(AccuRequest request) throws Fault {

        ObjectFactory factory = new ObjectFactory();
        AccuResponse response = factory.createAccuResponse();
        try {
            int percentage = 100 - request.getAccuPercentage().intValue();

            if(request.getAccuPercentage().intValue() < 0 || request.getAccuPercentage().intValue() > 100){
                AccuFault percentageError = new AccuFault();
                percentageError.setErrorCode(Short.parseShort("Alleen percentages tussen de 0 en 100 zijn toegsetaan"));

                throw new Fault("Message: ", percentageError);
            }
            else {
                String result = "Uw accu zal zich over: " + percentage + "% ontladen";
                response.setResult(result);
            }

        } catch (Exception e){
            AccuFault error = new AccuFault();
            error.setErrorCode(Short.parseShort("Er ging iets fout bij het berekenen van het accupercentage"));

            throw new Fault("Message: ", error);
        }

        return response;
    }
}
