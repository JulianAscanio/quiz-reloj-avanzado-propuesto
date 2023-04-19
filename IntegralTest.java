import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Formatter;
import java.util.Locale;

public class IntegralTest {
    public static void main(String[] arg)
    {
        RelojTest r = new RelojTest ();
        int grade = 0;

        try {
            r.testConsstructores();
            System.out.println(formatOutput("testConsstructores", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConsstructores", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConsstructores", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testAvanzarHorario1();
            System.out.println(formatOutput("testAvanzarHorario1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAvanzarHorario1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAvanzarHorario1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testRetrocederHorario1();
            System.out.println(formatOutput("testRetrocederHorario1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRetrocederHorario1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRetrocederHorario1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testAvanzarHorario2();
            System.out.println(formatOutput("testAvanzarHorario2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAvanzarHorario2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAvanzarHorario2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testRetrocederHorario2();
            System.out.println(formatOutput("testRetrocederHorario2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRetrocederHorario2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRetrocederHorario2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testAvanzarMinutero1();
            System.out.println(formatOutput("testAvanzarMinutero1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAvanzarMinutero1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAvanzarMinutero1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testRetrocederMinutero1();
            System.out.println(formatOutput("testRetrocederMinutero1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRetrocederMinutero1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRetrocederMinutero1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testAvanzarMinutero2();
            System.out.println(formatOutput("testAvanzarMinutero2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAvanzarMinutero2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAvanzarMinutero2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testRetrocederMinutero2();
            System.out.println(formatOutput("testRetrocederMinutero2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRetrocederMinutero2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRetrocederMinutero2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testAvanzarSegundero1();
            System.out.println(formatOutput("testAvanzarSegundero1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAvanzarSegundero1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAvanzarSegundero1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testRetrocederSegundero1();
            System.out.println(formatOutput("testRetrocederSegundero1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRetrocederSegundero1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRetrocederSegundero1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testAvanzarSegundero2();
            System.out.println(formatOutput("testAvanzarSegundero2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAvanzarSegundero2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAvanzarSegundero2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testRetrocederSegundero2();
            System.out.println(formatOutput("testRetrocederSegundero2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRetrocederSegundero2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRetrocederSegundero2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testIntegralAvanzar1();
            System.out.println(formatOutput("testIntegralAvanzar1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIntegralAvanzar1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIntegralAvanzar1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testIntegralRetroceder1();
            System.out.println(formatOutput("testIntegralRetroceder1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIntegralRetroceder1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIntegralRetroceder1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testIntegralAvanzar2();
            System.out.println(formatOutput("testIntegralAvanzar2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIntegralAvanzar2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIntegralAvanzar2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testIntegralRetroceder2();
            System.out.println(formatOutput("testIntegralRetroceder2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIntegralRetroceder2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIntegralRetroceder2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testIntegral1();
            System.out.println(formatOutput("testIntegral1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIntegral1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIntegral1", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testIntegral2();
            System.out.println(formatOutput("testIntegral2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIntegral2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIntegral2", "5", new AssertionError(e.getMessage())));
        }
        try {
            r.testIntegral3();
            System.out.println(formatOutput("testIntegral3", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIntegral3", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIntegral3", "5", new AssertionError(e.getMessage())));
        }

        
        System.out.println("Grade :=>> "+grade);
    }
    private static String formatOutput(String testName, String value, AssertionError e) {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb, Locale.getDefault());
        String grade = (e == null ? value : "0");
        f.format("Comment :=>> %s: %s. %s marks\n", testName, (e == null ? "success" : "failure"), grade);
        if (e != null) {
            f.format("********************\n%s\n", e.getMessage());
        }
        return sb.toString();
    }

    @Test
    public void testDummy(){IntegralTest.main(null);}

}
