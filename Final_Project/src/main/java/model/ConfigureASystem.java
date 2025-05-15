/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.enterprise.DistributionCompany;
import model.enterprise.Enterprise;
import model.enterprise.EnterpriseDirectory;
import model.enterprise.ProductionHouse;
import model.enterprise.TheaterChain;
import model.enterprise.TicketingPlatform;
import model.network.Network;
import model.organization.AdminOrganization;
import model.organization.CastOrganization;
import model.organization.CustomerOrganization;
import model.organization.CustomerSupportOrganization;
import model.organization.DirectorOrganization;
import model.organization.DistributorOperationsOrganization;
import model.organization.ProducerOrganization;
import model.organization.ScreenWriterOrganization;
import model.organization.ScreeningOperationsOrganization;
import model.person.Person;
import model.person.PersonDirectory;
import model.role.AdminRole;
import model.role.CastRole;
import model.role.CustomerRole;
import model.role.CustomerSupportRole;
import model.role.DirectorRole;
import model.role.DistributorRole;
import model.role.ProducerRole;
import model.role.ScreenWriterRole;
import model.role.TheaterManagerRole;
import model.theater.Screen;
import model.theater.Theater;
import model.useraccount.UserAccountDirectory;

/**
 *
 * @author arenarune
 */
public class ConfigureASystem {
    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();
        
        Network network = system.newNetwork("USA");
        UserAccountDirectory uad = network.getUserAccountDirectory();
        PersonDirectory pd = network.getPersonDirectory();
        EnterpriseDirectory ed = network.getEnterpriseDirectory();
        UserAccountDirectory adminDirectory = system.getAdminDirectory();
        PersonDirectory personDirectory = system.getPersonDirectory();
        CustomerOrganization customerOrganization = system.getCustomerOrganization();
        UserAccountDirectory customerDirectory = system.getCustomerDirectory();
        
        TheaterChain amc = (TheaterChain) ed.newEnterprise("AMC", Enterprise.EnterpriseType.TheaterChain);
        ProductionHouse wb = (ProductionHouse) ed.newEnterprise("WarnerBros.", Enterprise.EnterpriseType.ProductionHouse);
        Enterprise bms = ed.newEnterprise("Book My Show", Enterprise.EnterpriseType.TicketingPlatform);
        DistributionCompany sony = (DistributionCompany) ed.newEnterprise("Sony", Enterprise.EnterpriseType.DistributionHouse);
        
        DirectorOrganization directorOrganization = wb.getDirectorOrganization();
        ProducerOrganization producerOrganization = wb.getProducerOrganization();
        CastOrganization castOrganization = wb.getCastOrganization();
        ScreenWriterOrganization screenWriterOrganization = wb.getScreenWriterOrganization();
        ScreeningOperationsOrganization screeningOperationsOrganization = amc.getScreeningOperationsOrganization();
        DistributorOperationsOrganization distributorOperationsOrganization = sony.getDistributorOperationsOrganization();
        
        Person admin = personDirectory.newPerson();
        AdminRole ar = new AdminRole(admin);
        admin.setRole(ar);
        adminDirectory.newUserAccount(admin, "p@gmail.com", "admin", "xxxx", ar);
        
        Person customer1 = personDirectory.newPerson();
        CustomerRole cr1 = new CustomerRole(customer1);
        customer1.setRole(cr1);
        customerDirectory.newUserAccount(customer1, "Customer1@gmail.com", "customer1", "xxxx", cr1);

        Person customer2 = personDirectory.newPerson();
        CustomerRole cr2 = new CustomerRole(customer2);
        customer2.setRole(cr2);
        customerDirectory.newUserAccount(customer2, "Customer2@gmail.com", "customer2", "xxxx", cr2);

        Person customer3 = personDirectory.newPerson();
        CustomerRole cr3 = new CustomerRole(customer3);
        customer3.setRole(cr3);
        customerDirectory.newUserAccount(customer3, "Customer3@gmail.com", "customer3", "xxxx", cr3);

        Person customer4 = personDirectory.newPerson();
        CustomerRole cr4 = new CustomerRole(customer4);
        customer4.setRole(cr4);
        customerDirectory.newUserAccount(customer4, "Customer4@gmail.com", "customer4", "xxxx", cr4);

        Person customer5 = personDirectory.newPerson();
        CustomerRole cr5 = new CustomerRole(customer5);
        customer5.setRole(cr5);
        customerDirectory.newUserAccount(customer5, "Customer5@gmail.com", "customer5", "xxxx", cr5);

        Person customer6 = personDirectory.newPerson();
        CustomerRole cr6 = new CustomerRole(customer6);
        customer6.setRole(cr6);
        customerDirectory.newUserAccount(customer6, "Customer6@gmail.com", "customer6", "xxxx", cr6);

        Person customer7 = personDirectory.newPerson();
        CustomerRole cr7 = new CustomerRole(customer7);
        customer7.setRole(cr7);
        customerDirectory.newUserAccount(customer7, "Customer7@gmail.com", "customer7", "xxxx", cr7);

        Person customer8 = personDirectory.newPerson();
        CustomerRole cr8 = new CustomerRole(customer8);
        customer8.setRole(cr8);
        customerDirectory.newUserAccount(customer8, "Customer8@gmail.com", "customer8", "xxxx", cr8);

        Person customer9 = personDirectory.newPerson();
        CustomerRole cr9 = new CustomerRole(customer9);
        customer9.setRole(cr9);
        customerDirectory.newUserAccount(customer9, "Customer9@gmail.com", "customer9", "xxxx", cr9);

        Person customer10 = personDirectory.newPerson();
        CustomerRole cr10 = new CustomerRole(customer10);
        customer10.setRole(cr10);
        customerDirectory.newUserAccount(customer10, "Customer10@gmail.com", "customer10", "xxxx", cr10);

        
        Person producer1 = pd.newPerson();
        ProducerRole pr1 = producerOrganization.newProducer(producer1);
        producer1.setRole(pr1);
        uad.newUserAccount(producer1, "producer1@gmail.com", "producer1", "xxxx", pr1);

        Person producer2 = pd.newPerson();
        ProducerRole pr2 = producerOrganization.newProducer(producer2);
        producer2.setRole(pr2);
        uad.newUserAccount(producer2, "producer2@gmail.com", "producer2", "xxxx", pr2);

        Person producer3 = pd.newPerson();
        ProducerRole pr3 = producerOrganization.newProducer(producer3);
        producer3.setRole(pr3);
        uad.newUserAccount(producer3, "producer3@gmail.com", "producer3", "xxxx", pr3);

        Person producer4 = pd.newPerson();
        ProducerRole pr4 = producerOrganization.newProducer(producer4);
        producer4.setRole(pr4);
        uad.newUserAccount(producer4, "producer4@gmail.com", "producer4", "xxxx", pr4);

        Person producer5 = pd.newPerson();
        ProducerRole pr5 = producerOrganization.newProducer(producer5);
        producer5.setRole(pr5);
        uad.newUserAccount(producer5, "producer5@gmail.com", "producer5", "xxxx", pr5);

        Person producer6 = pd.newPerson();
        ProducerRole pr6 = producerOrganization.newProducer(producer6);
        producer6.setRole(pr6);
        uad.newUserAccount(producer6, "producer6@gmail.com", "producer6", "xxxx", pr6);

        Person producer7 = pd.newPerson();
        ProducerRole pr7 = producerOrganization.newProducer(producer7);
        producer7.setRole(pr7);
        uad.newUserAccount(producer7, "producer7@gmail.com", "producer7", "xxxx", pr7);

        Person producer8 = pd.newPerson();
        ProducerRole pr8 = producerOrganization.newProducer(producer8);
        producer8.setRole(pr8);
        uad.newUserAccount(producer8, "producer8@gmail.com", "producer8", "xxxx", pr8);

        Person producer9 = pd.newPerson();
        ProducerRole pr9 = producerOrganization.newProducer(producer9);
        producer9.setRole(pr9);
        uad.newUserAccount(producer9, "producer9@gmail.com", "producer9", "xxxx", pr9);

        Person producer10 = pd.newPerson();
        ProducerRole pr10 = producerOrganization.newProducer(producer10);
        producer10.setRole(pr10);
        uad.newUserAccount(producer10, "producer10@gmail.com", "producer10", "xxxx", pr10);

        
        Person director1 = pd.newPerson();
        director1.setFirstName("Chris");
        director1.setLastName("Nolan");
        DirectorRole dr1 = directorOrganization.newDirector(director1);
        director1.setRole(dr1);
        uad.newUserAccount(director1, "director1@gmail.com", "director1", "xxxx", dr1);

        Person director2 = pd.newPerson();
        director2.setFirstName("Steven");
        director2.setLastName("Spielberg");
        DirectorRole dr2 = directorOrganization.newDirector(director2);
        director2.setRole(dr2);
        uad.newUserAccount(director2, "director2@gmail.com", "director2", "xxxx", dr2);

        Person director3 = pd.newPerson();
        director3.setFirstName("James");
        director3.setLastName("Cameron");
        DirectorRole dr3 = directorOrganization.newDirector(director3);
        director3.setRole(dr3);
        uad.newUserAccount(director3, "director3@gmail.com", "director3", "xxxx", dr3);

        Person director4 = pd.newPerson();
        director4.setFirstName("Quentin");
        director4.setLastName("Tarantino");
        DirectorRole dr4 = directorOrganization.newDirector(director4);
        director4.setRole(dr4);
        uad.newUserAccount(director4, "director4@gmail.com", "director4", "xxxx", dr4);

        Person director5 = pd.newPerson();
        director5.setFirstName("Martin");
        director5.setLastName("Scorsese");
        DirectorRole dr5 = directorOrganization.newDirector(director5);
        director5.setRole(dr5);
        uad.newUserAccount(director5, "director5@gmail.com", "director5", "xxxx", dr5);

        Person director6 = pd.newPerson();
        director6.setFirstName("Ridley");
        director6.setLastName("Scott");
        DirectorRole dr6 = directorOrganization.newDirector(director6);
        director6.setRole(dr6);
        uad.newUserAccount(director6, "director6@gmail.com", "director6", "xxxx", dr6);

        Person director7 = pd.newPerson();
        director7.setFirstName("Sofia");
        director7.setLastName("Coppola");
        DirectorRole dr7 = directorOrganization.newDirector(director7);
        director7.setRole(dr7);
        uad.newUserAccount(director7, "director7@gmail.com", "director7", "xxxx", dr7);

        Person director8 = pd.newPerson();
        director8.setFirstName("Greta");
        director8.setLastName("Gerwig");
        DirectorRole dr8 = directorOrganization.newDirector(director8);
        director8.setRole(dr8);
        uad.newUserAccount(director8, "director8@gmail.com", "director8", "xxxx", dr8);

        Person director9 = pd.newPerson();
        director9.setFirstName("Jordan");
        director9.setLastName("Peele");
        DirectorRole dr9 = directorOrganization.newDirector(director9);
        director9.setRole(dr9);
        uad.newUserAccount(director9, "director9@gmail.com", "director9", "xxxx", dr9);

        Person director10 = pd.newPerson();
        director10.setFirstName("Patty");
        director10.setLastName("Jenkins");
        DirectorRole dr10 = directorOrganization.newDirector(director10);
        director10.setRole(dr10);
        uad.newUserAccount(director10, "director10@gmail.com", "director10", "xxxx", dr10);

        
        Person screenWriter1 = pd.newPerson();
        screenWriter1.setFirstName("John");
        screenWriter1.setLastName("Nolan");
        ScreenWriterRole swr1 = screenWriterOrganization.newScreenWriter(screenWriter1);
        screenWriter1.setRole(swr1);
        uad.newUserAccount(screenWriter1, "screenwriter1@gmail.com", "screenwriter1", "xxxx", swr1);

        Person screenWriter2 = pd.newPerson();
        screenWriter2.setFirstName("Aaron");
        screenWriter2.setLastName("Sorkin");
        ScreenWriterRole swr2 = screenWriterOrganization.newScreenWriter(screenWriter2);
        screenWriter2.setRole(swr2);
        uad.newUserAccount(screenWriter2, "screenwriter2@gmail.com", "screenwriter2", "xxxx", swr2);

        Person screenWriter3 = pd.newPerson();
        screenWriter3.setFirstName("Charlie");
        screenWriter3.setLastName("Kaufman");
        ScreenWriterRole swr3 = screenWriterOrganization.newScreenWriter(screenWriter3);
        screenWriter3.setRole(swr3);
        uad.newUserAccount(screenWriter3, "screenwriter3@gmail.com", "screenwriter3", "xxxx", swr3);

        Person screenWriter4 = pd.newPerson();
        screenWriter4.setFirstName("Greta");
        screenWriter4.setLastName("Gerwig");
        ScreenWriterRole swr4 = screenWriterOrganization.newScreenWriter(screenWriter4);
        screenWriter4.setRole(swr4);
        uad.newUserAccount(screenWriter4, "screenwriter4@gmail.com", "screenwriter4", "xxxx", swr4);

        Person screenWriter5 = pd.newPerson();
        screenWriter5.setFirstName("Nora");
        screenWriter5.setLastName("Ephron");
        ScreenWriterRole swr5 = screenWriterOrganization.newScreenWriter(screenWriter5);
        screenWriter5.setRole(swr5);
        uad.newUserAccount(screenWriter5, "screenwriter5@gmail.com", "screenwriter5", "xxxx", swr5);

        Person screenWriter6 = pd.newPerson();
        screenWriter6.setFirstName("Christopher");
        screenWriter6.setLastName("McQuarrie");
        ScreenWriterRole swr6 = screenWriterOrganization.newScreenWriter(screenWriter6);
        screenWriter6.setRole(swr6);
        uad.newUserAccount(screenWriter6, "screenwriter6@gmail.com", "screenwriter6", "xxxx", swr6);

        Person screenWriter7 = pd.newPerson();
        screenWriter7.setFirstName("Diablo");
        screenWriter7.setLastName("Cody");
        ScreenWriterRole swr7 = screenWriterOrganization.newScreenWriter(screenWriter7);
        screenWriter7.setRole(swr7);
        uad.newUserAccount(screenWriter7, "screenwriter7@gmail.com", "screenwriter7", "xxxx", swr7);

        Person screenWriter8 = pd.newPerson();
        screenWriter8.setFirstName("Jordan");
        screenWriter8.setLastName("Peele");
        ScreenWriterRole swr8 = screenWriterOrganization.newScreenWriter(screenWriter8);
        screenWriter8.setRole(swr8);
        uad.newUserAccount(screenWriter8, "screenwriter8@gmail.com", "screenwriter8", "xxxx", swr8);

        Person screenWriter9 = pd.newPerson();
        screenWriter9.setFirstName("Sophia");
        screenWriter9.setLastName("Kops");
        ScreenWriterRole swr9 = screenWriterOrganization.newScreenWriter(screenWriter9);
        screenWriter9.setRole(swr9);
        uad.newUserAccount(screenWriter9, "screenwriter9@gmail.com", "screenwriter9", "xxxx", swr9);

        Person screenWriter10 = pd.newPerson();
        screenWriter10.setFirstName("Patty");
        screenWriter10.setLastName("Jenkins");
        ScreenWriterRole swr10 = screenWriterOrganization.newScreenWriter(screenWriter10);
        screenWriter10.setRole(swr10);
        uad.newUserAccount(screenWriter10, "screenwriter10@gmail.com", "screenwriter10", "xxxx", swr10);

        Person cast_1 = pd.newPerson();
        cast_1.setFirstName("Hugh");
        cast_1.setLastName("Jackman");
        CastRole cast1 = castOrganization.newCast(cast_1);
        cast_1.setRole(cast1);
        uad.newUserAccount(cast_1, "cast1@gmail.com", "cast1", "xxxx", cast1);

        Person cast_2 = pd.newPerson();
        cast_2.setFirstName("Scarlett");
        cast_2.setLastName("Johansson");
        CastRole cast2 = castOrganization.newCast(cast_2);
        cast_2.setRole(cast2);
        uad.newUserAccount(cast_2, "cast2@gmail.com", "cast2", "xxxx", cast2);

        Person cast_3 = pd.newPerson();
        cast_3.setFirstName("Dwayne");
        cast_3.setLastName("Johnson");
        CastRole cast3 = castOrganization.newCast(cast_3);
        cast_3.setRole(cast3);
        uad.newUserAccount(cast_3, "cast3@gmail.com", "cast3", "xxxx", cast3);

        Person cast_4 = pd.newPerson();
        cast_4.setFirstName("Emma");
        cast_4.setLastName("Watson");
        CastRole cast4 = castOrganization.newCast(cast_4);
        cast_4.setRole(cast4);
        uad.newUserAccount(cast_4, "cast4@gmail.com", "cast4", "xxxx", cast4);

        Person cast_5 = pd.newPerson();
        cast_5.setFirstName("Robert");
        cast_5.setLastName("Downey Jr.");
        CastRole cast5 = castOrganization.newCast(cast_5);
        cast_5.setRole(cast5);
        uad.newUserAccount(cast_5, "cast5@gmail.com", "cast5", "xxxx", cast5);

        Person cast_6 = pd.newPerson();
        cast_6.setFirstName("Jennifer");
        cast_6.setLastName("Lawrence");
        CastRole cast6 = castOrganization.newCast(cast_6);
        cast_6.setRole(cast6);
        uad.newUserAccount(cast_6, "cast6@gmail.com", "cast6", "xxxx", cast6);

        Person cast_7 = pd.newPerson();
        cast_7.setFirstName("Chris");
        cast_7.setLastName("Evans");
        CastRole cast7 = castOrganization.newCast(cast_7);
        cast_7.setRole(cast7);
        uad.newUserAccount(cast_7, "cast7@gmail.com", "cast7", "xxxx", cast7);

        Person cast_8 = pd.newPerson();
        cast_8.setFirstName("Gal");
        cast_8.setLastName("Gadot");
        CastRole cast8 = castOrganization.newCast(cast_8);
        cast_8.setRole(cast8);
        uad.newUserAccount(cast_8, "cast8@gmail.com", "cast8", "xxxx", cast8);

        Person cast_9 = pd.newPerson();
        cast_9.setFirstName("Tom");
        cast_9.setLastName("Holland");
        CastRole cast9 = castOrganization.newCast(cast_9);
        cast_9.setRole(cast9);
        uad.newUserAccount(cast_9, "cast9@gmail.com", "cast9", "xxxx", cast9);

        Person cast_10 = pd.newPerson();
        cast_10.setFirstName("Zendaya");
        cast_10.setLastName("Coleman");
        CastRole cast10 = castOrganization.newCast(cast_10);
        cast_10.setRole(cast10);
        uad.newUserAccount(cast_10, "cast10@gmail.com", "cast10", "xxxx", cast10);

        Person distributor1 = pd.newPerson();
        distributor1.setFirstName("Blake");
        distributor1.setLastName("Johnson");
        DistributorRole dist1 = distributorOperationsOrganization.newDistributor(distributor1);
        distributor1.setRole(dist1);
        uad.newUserAccount(distributor1, "distributor1@gmail.com", "distributor1", "xxxx", dist1);
        
        Person distributor2 = pd.newPerson();
        distributor2.setFirstName("Liam");
        distributor2.setLastName("Smith");
        DistributorRole dist2 = distributorOperationsOrganization.newDistributor(distributor2);
        distributor2.setRole(dist2);
        uad.newUserAccount(distributor2, "distributor2@gmail.com", "distributor2", "xxxx", dist2);
        
        Person distributor3 = pd.newPerson();
        distributor3.setFirstName("Ava");
        distributor3.setLastName("Brown");
        DistributorRole dist3 = distributorOperationsOrganization.newDistributor(distributor3);
        distributor3.setRole(dist3);
        uad.newUserAccount(distributor3, "distributor3@gmail.com", "distributor3", "xxxx", dist3);
        
        Person distributor4 = pd.newPerson();
        distributor4.setFirstName("Mason");
        distributor4.setLastName("Wilson");
        DistributorRole dist4 = distributorOperationsOrganization.newDistributor(distributor4);
        distributor4.setRole(dist4);
        uad.newUserAccount(distributor4, "distributor4@gmail.com", "distributor4", "xxxx", dist4);
        
        Person distributor5 = pd.newPerson();
        distributor5.setFirstName("Sophia");
        distributor5.setLastName("Taylor");
        DistributorRole dist5 = distributorOperationsOrganization.newDistributor(distributor5);
        distributor5.setRole(dist5);
        uad.newUserAccount(distributor5, "distributor5@gmail.com", "distributor5", "xxxx", dist5);
        
        Person distributor6 = pd.newPerson();
        distributor6.setFirstName("Ethan");
        distributor6.setLastName("Anderson");
        DistributorRole dist6 = distributorOperationsOrganization.newDistributor(distributor6);
        distributor6.setRole(dist6);
        uad.newUserAccount(distributor6, "distributor6@gmail.com", "distributor6", "xxxx", dist6);
        
        Person distributor7 = pd.newPerson();
        distributor7.setFirstName("Emma");
        distributor7.setLastName("Thomas");
        DistributorRole dist7 = distributorOperationsOrganization.newDistributor(distributor7);
        distributor7.setRole(dist7);
        uad.newUserAccount(distributor7, "distributor7@gmail.com", "distributor7", "xxxx", dist7);
        
        Person distributor8 = pd.newPerson();
        distributor8.setFirstName("Noah");
        distributor8.setLastName("Lee");
        DistributorRole dist8 = distributorOperationsOrganization.newDistributor(distributor8);
        distributor8.setRole(dist8);
        uad.newUserAccount(distributor8, "distributor8@gmail.com", "distributor8", "xxxx", dist8);
        
        Person distributor9 = pd.newPerson();
        distributor9.setFirstName("Isabella");
        distributor9.setLastName("Martinez");
        DistributorRole dist9 = distributorOperationsOrganization.newDistributor(distributor9);
        distributor9.setRole(dist9);
        uad.newUserAccount(distributor9, "distributor9@gmail.com", "distributor9", "xxxx", dist9);
        
        Person distributor10 = pd.newPerson();
        distributor10.setFirstName("Lucas");
        distributor10.setLastName("Garcia");
        DistributorRole dist10 = distributorOperationsOrganization.newDistributor(distributor10);
        distributor10.setRole(dist10);
        uad.newUserAccount(distributor10, "distributor10@gmail.com", "distributor10", "xxxx", dist10);

        Person theaterManager1 = pd.newPerson();
        theaterManager1.setFirstName("Oliver");
        theaterManager1.setLastName("Green");
        TheaterManagerRole tmr1 = screeningOperationsOrganization.newTheaterManager(theaterManager1);
        theaterManager1.setRole(tmr1);
        uad.newUserAccount(theaterManager1, "theatermanager1@gmail.com", "theatermanager1", "xxxx", tmr1);

        Person theaterManager2 = pd.newPerson();
        theaterManager2.setFirstName("Charlotte");
        theaterManager2.setLastName("White");
        TheaterManagerRole tmr2 = screeningOperationsOrganization.newTheaterManager(theaterManager2);
        theaterManager2.setRole(tmr2);
        uad.newUserAccount(theaterManager2, "theatermanager2@gmail.com", "theatermanager2", "xxxx", tmr2);

        Person theaterManager3 = pd.newPerson();
        theaterManager3.setFirstName("Henry");
        theaterManager3.setLastName("Adams");
        TheaterManagerRole tmr3 = screeningOperationsOrganization.newTheaterManager(theaterManager3);
        theaterManager3.setRole(tmr3);
        uad.newUserAccount(theaterManager3, "theatermanager3@gmail.com", "theatermanager3", "xxxx", tmr3);

        Person theaterManager4 = pd.newPerson();
        theaterManager4.setFirstName("Amelia");
        theaterManager4.setLastName("Parker");
        TheaterManagerRole tmr4 = screeningOperationsOrganization.newTheaterManager(theaterManager4);
        theaterManager4.setRole(tmr4);
        uad.newUserAccount(theaterManager4, "theatermanager4@gmail.com", "theatermanager4", "xxxx", tmr4);

        Person theaterManager5 = pd.newPerson();
        theaterManager5.setFirstName("William");
        theaterManager5.setLastName("Harris");
        TheaterManagerRole tmr5 = screeningOperationsOrganization.newTheaterManager(theaterManager5);
        theaterManager5.setRole(tmr5);
        uad.newUserAccount(theaterManager5, "theatermanager5@gmail.com", "theatermanager5", "xxxx", tmr5);

        Person theaterManager6 = pd.newPerson();
        theaterManager6.setFirstName("Isla");
        theaterManager6.setLastName("Clark");
        TheaterManagerRole tmr6 = screeningOperationsOrganization.newTheaterManager(theaterManager6);
        theaterManager6.setRole(tmr6);
        uad.newUserAccount(theaterManager6, "theatermanager6@gmail.com", "theatermanager6", "xxxx", tmr6);

        Person theaterManager7 = pd.newPerson();
        theaterManager7.setFirstName("James");
        theaterManager7.setLastName("Robinson");
        TheaterManagerRole tmr7 = screeningOperationsOrganization.newTheaterManager(theaterManager7);
        theaterManager7.setRole(tmr7);
        uad.newUserAccount(theaterManager7, "theatermanager7@gmail.com", "theatermanager7", "xxxx", tmr7);

        Person theaterManager8 = pd.newPerson();
        theaterManager8.setFirstName("Mia");
        theaterManager8.setLastName("Lewis");
        TheaterManagerRole tmr8 = screeningOperationsOrganization.newTheaterManager(theaterManager8);
        theaterManager8.setRole(tmr8);
        uad.newUserAccount(theaterManager8, "theatermanager8@gmail.com", "theatermanager8", "xxxx", tmr8);

        Person theaterManager9 = pd.newPerson();
        theaterManager9.setFirstName("Benjamin");
        theaterManager9.setLastName("Walker");
        TheaterManagerRole tmr9 = screeningOperationsOrganization.newTheaterManager(theaterManager9);
        theaterManager9.setRole(tmr9);
        uad.newUserAccount(theaterManager9, "theatermanager9@gmail.com", "theatermanager9", "xxxx", tmr9);

        Person theaterManager10 = pd.newPerson();
        theaterManager10.setFirstName("Sophia");
        theaterManager10.setLastName("King");
        TheaterManagerRole tmr10 = screeningOperationsOrganization.newTheaterManager(theaterManager10);
        theaterManager10.setRole(tmr10);
        uad.newUserAccount(theaterManager10, "theatermanager10@gmail.com", "theatermanager10", "xxxx", tmr10);

        Theater theater1 = amc.newTheater();
        theater1.setTheaterManager(tmr1);
        tmr1.setTheater(theater1);
        theater1.setName("BostonCommon");
        theater1.setTheaterChain(amc);

        Theater theater2 = amc.newTheater();
        theater2.setTheaterManager(tmr2);
        tmr2.setTheater(theater2);
        theater2.setName("CambridgeCinema");
        theater2.setTheaterChain(amc);

        Theater theater3 = amc.newTheater();
        theater3.setTheaterManager(tmr3);
        tmr3.setTheater(theater3);
        theater3.setName("DowntownTheater");
        theater3.setTheaterChain(amc);

        Theater theater4 = amc.newTheater();
        theater4.setTheaterManager(tmr4);
        tmr4.setTheater(theater4);
        theater4.setName("BackBayTheater");
        theater4.setTheaterChain(amc);

        Theater theater5 = amc.newTheater();
        theater5.setTheaterManager(tmr5);
        tmr5.setTheater(theater5);
        theater5.setName("FenwayCineplex");
        theater5.setTheaterChain(amc);

        Theater theater6 = amc.newTheater();
        theater6.setTheaterManager(tmr6);
        tmr6.setTheater(theater6);
        theater6.setName("SeaportCinema");
        theater6.setTheaterChain(amc);

        Theater theater7 = amc.newTheater();
        theater7.setTheaterManager(tmr7);
        tmr7.setTheater(theater7);
        theater7.setName("HarvardSquareTheater");
        theater7.setTheaterChain(amc);

        Theater theater8 = amc.newTheater();
        theater8.setTheaterManager(tmr8);
        tmr8.setTheater(theater8);
        theater8.setName("SomervilleCinema");
        theater8.setTheaterChain(amc);

        Theater theater9 = amc.newTheater();
        theater9.setTheaterManager(tmr9);
        tmr9.setTheater(theater9);
        theater9.setName("ChestnutHillTheater");
        theater9.setTheaterChain(amc);

        Theater theater10 = amc.newTheater();
        theater10.setTheaterManager(tmr10);
        tmr10.setTheater(theater10);
        theater10.setName("BraintreeTheater");
        theater10.setTheaterChain(amc);

        // Adding screens for theater1
        Screen screen_1_1 = theater1.newScreen("Screen 1");
        Screen screen_1_2 = theater1.newScreen("Screen 2");
        Screen screen_1_3 = theater1.newScreen("Screen 3");

        // Adding screens for theater2
        Screen screen_2_1 = theater2.newScreen("Screen 1");
        Screen screen_2_2 = theater2.newScreen("Screen 2");
        Screen screen_2_3 = theater2.newScreen("Screen 3");

        // Adding screens for theater3
        Screen screen_3_1 = theater3.newScreen("Screen 1");
        Screen screen_3_2 = theater3.newScreen("Screen 2");
        Screen screen_3_3 = theater3.newScreen("Screen 3");

        // Adding screens for theater4
        Screen screen_4_1 = theater4.newScreen("Screen 1");
        Screen screen_4_2 = theater4.newScreen("Screen 2");
        Screen screen_4_3 = theater4.newScreen("Screen 3");

        // Adding screens for theater5
        Screen screen_5_1 = theater5.newScreen("Screen 1");
        Screen screen_5_2 = theater5.newScreen("Screen 2");
        Screen screen_5_3 = theater5.newScreen("Screen 3");

        // Adding screens for theater6
        Screen screen_6_1 = theater6.newScreen("Screen 1");
        Screen screen_6_2 = theater6.newScreen("Screen 2");
        Screen screen_6_3 = theater6.newScreen("Screen 3");

        // Adding screens for theater7
        Screen screen_7_1 = theater7.newScreen("Screen 1");
        Screen screen_7_2 = theater7.newScreen("Screen 2");
        Screen screen_7_3 = theater7.newScreen("Screen 3");

        // Adding screens for theater8
        Screen screen_8_1 = theater8.newScreen("Screen 1");
        Screen screen_8_2 = theater8.newScreen("Screen 2");
        Screen screen_8_3 = theater8.newScreen("Screen 3");

        // Adding screens for theater9
        Screen screen_9_1 = theater9.newScreen("Screen 1");
        Screen screen_9_2 = theater9.newScreen("Screen 2");
        Screen screen_9_3 = theater9.newScreen("Screen 3");

        // Adding screens for theater10
        Screen screen_10_1 = theater10.newScreen("Screen 1");
        Screen screen_10_2 = theater10.newScreen("Screen 2");
        Screen screen_10_3 = theater10.newScreen("Screen 3");

        return system;
    }
}
