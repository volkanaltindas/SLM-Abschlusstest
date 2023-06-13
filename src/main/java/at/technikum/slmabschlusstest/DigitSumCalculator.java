package at.technikum.slmabschlusstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitSumCalculator {

    public static int count = 0;
    @GetMapping("api/digitsum")
    public static int CalculateSum(@RequestParam int number){
        int sum = 0;
        while(number!=0){
            sum += number%10;
            number/=10;

        }
        count++;
        return sum;
    }

    @GetMapping("api/digitsum/usage")
    public static int usage(){

        return count;
    }
}
