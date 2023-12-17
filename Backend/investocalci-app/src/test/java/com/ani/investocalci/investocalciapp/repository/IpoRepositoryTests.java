package com.ani.investocalci.investocalciapp.repository;

import com.ani.investocalci.investocalciapp.entity.IPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestConstructor;

import java.time.LocalDate;

@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class IpoRepositoryTests {

    private IpoRepository ipoRepository;

    @Autowired
    IpoRepositoryTests(IpoRepository ipoRepository){
        this.ipoRepository = ipoRepository;
    }

    @Test
    public void testCreateIpo(){
        IPO testIpo = new IPO();
        testIpo.setCompany("Penna Cement Industries Limited");
        testIpo.setType("Upcoming");

        ipoRepository.save(testIpo);
    }

    @Test
    public void testCreateMoreIpos(){
        IPO testFlairIpo = new IPO();
        testFlairIpo.setCompany("Flair Writing Industries");
        testFlairIpo.setType("Listed");
        testFlairIpo.setListedOn(LocalDate.of(2023, 12, 1));
        testFlairIpo.setPriceRangeLow(288);
        testFlairIpo.setPriceRangeHigh(304);
        testFlairIpo.setListedPrice(501);
        testFlairIpo.setMinInvestment(14112);

        IPO testFedbankIpo = new IPO();
        testFedbankIpo.setCompany("Fedbank Financial Services");
        testFedbankIpo.setType("Listed");
        testFedbankIpo.setListedOn(LocalDate.of(2023, 11, 30));
        testFedbankIpo.setPriceRangeLow(135);
        testFedbankIpo.setPriceRangeHigh(140);
        testFedbankIpo.setListedPrice(138);
        testFedbankIpo.setMinInvestment(14231);

        ipoRepository.save(testFlairIpo);
        ipoRepository.save(testFedbankIpo);
    }
}
