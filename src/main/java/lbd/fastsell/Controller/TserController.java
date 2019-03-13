package lbd.fastsell.Controller;
@RestController
public class TserController {
    @RequestMapping("he")
    public String test(){
        return "hello!";
    }
}
