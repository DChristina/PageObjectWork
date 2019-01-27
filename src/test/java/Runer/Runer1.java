package Runer;

import Tests.TestsAutoRia;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)//для запуска пакета тестов , в @suite.suiteclasses можно указать перечень классов для прогона
@Suite.SuiteClasses(TestsAutoRia.class)
public class Runer1 {
}

