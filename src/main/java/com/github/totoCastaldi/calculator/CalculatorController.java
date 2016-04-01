package com.github.totoCastaldi.calculator;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.POST;
import org.rapidoid.http.Req;

import java.util.Map;

/**
 * Created by toto on 24/03/16.
 */
@Controller
public class CalculatorController {


    @POST
    public double calc(Req req) {
        final Map<String, Object> postedParameters = req.posted();
        final Double firstParameter = Double.valueOf(String.valueOf(postedParameters.get("a")));
        final Object optionalParameter = postedParameters.get("b");

        final Double secondParameter;
        if (optionalParameter != null) {
            secondParameter = Double.valueOf(String.valueOf(optionalParameter));
        } else {
            secondParameter = null;
        }

        final String operand = String.valueOf(postedParameters.get("o"));

        switch (operand) {
            case "plus" : {
                return firstParameter + secondParameter;
            }
            case "sqrt" : {
                return Math.sqrt(firstParameter);
            }
            case "sin" : {
                return Math.sin(firstParameter);
            }
            case "pow" : {
                return Math.pow(firstParameter, secondParameter);
            }

            default: break;
        }

        return 0;
    }

}
