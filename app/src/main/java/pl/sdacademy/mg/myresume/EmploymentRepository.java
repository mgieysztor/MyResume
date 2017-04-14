package pl.sdacademy.mg.myresume;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.mg.myresume.Model.Duty;
import pl.sdacademy.mg.myresume.Model.Employment;

/**
 * Created by Michał on 13-04-2017.
 */

public class EmploymentRepository {
    private List<Employment> employmentList;

    private EmploymentRepository() {

        employmentList = new ArrayList<>();
        List<Duty> employer1DutyList = new ArrayList<>();
        List<Duty> employer2DutyList = new ArrayList<>();
        List<Duty> employer3DutyList = new ArrayList<>();

        employer1DutyList.add(new Duty(true, "Project leader - implementation of an integrated management information system enterprise ERP TETA 2000 (Oracle engine)."));
        employer1DutyList.add(new Duty(true, "identification of business requirements towards an integrated management information system"));
        employer1DutyList.add(new Duty(true, "participation in the negotiations and pre-implementation analysis"));
        employer1DutyList.add(new Duty(true, "verification of pre-analysis document in accordance with the requirements of the investor"));
        employer1DutyList.add(new Duty(true, "preparation and data migration to the new system (such as the creation of new structures, indexes)"));
        employer1DutyList.add(new Duty(true, "Training and support for users (internal helpdesk), writing and executing queries to the database (SQL Navigator)"));
        employer1DutyList.add(new Duty(true, "Design, coding and implementation of a MS Access DB made in order to issue and keep record of L/C application forms."));
        employer1DutyList.add(new Duty(false, "sourcing – searching for new suppliers for new and existing product lines"));
        employer1DutyList.add(new Duty(false, "purchasing - procurement – demand planning, domestic and foreign (including Far East) purchasing coordination"));
        employer1DutyList.add(new Duty(false, "Development and implementation of approx. 15 new product lines (making approx. several hundreds of new SKU’s)"));
        employer1DutyList.add(new Duty(false, "creation of visual identification system for launched product lines"));
        employer1DutyList.add(new Duty(false, "defining the content of product and logistic labels"));
        employer1DutyList.add(new Duty(false, "controlling of the proper implementation of product identity by subcontractors (OEM)"));


        Employment employment1 = new Employment("ECONOMIC and MARKETING SPECIALIST",
                "PORTA PHU Export-Import",
                "Wrocław, PL",
                "Jan. 1999 – Jan. 2014",
                "Trade and manufacturing Company dealing with imports, production and distribution school and office products.",
                employer1DutyList);

        employer2DutyList.add(new Duty(false, "daily operational management of manufacturing enterprise employing over 100 people"));
        employer2DutyList.add(new Duty(false, "supervision over departments of production, maintenance, planning and purchasing"));
        employer2DutyList.add(new Duty(false, "close cooperation with HR and finance dept. including balance sheet and P&L statement analysis"));
        employer2DutyList.add(new Duty(false, "direct management of sales team"));
        employer2DutyList.add(new Duty(false, "personal responsibility for company’s key accounts, including business travels, price calculations and offers, contract negotiations"));
        employer2DutyList.add(new Duty(false, "preparation and participation in the branch international exhibition shows"));
        employer2DutyList.add(new Duty(false, "coordination of marketing activities (catalogues, leaflets, presentations, movies, web side)"));
        employer2DutyList.add(new Duty(false, "building export sales market from scratch, achievement: portfolio of 60+ active customers in 25 countries in Europe and Africa"));
        employer2DutyList.add(new Duty(false, "recruitment of staff"));
        employer2DutyList.add(new Duty(true, "co-leading role within green field investment project, referring to the set up of the manufacturing plant, including identification of needs towards ERP IT system and later supervision of its’ implementation"));
        employer2DutyList.add(new Duty(false, "specifying, sourcing, negotiating and acceptance of production lines"));
        employer2DutyList.add(new Duty(false, "supervision over production lines installations and trainings"));

        Employment employment2 = new Employment("PLANT MANAGER - proxy",
                "Gryphon sp. z o.o.",
                "Świdnica, PL",
                "May 2008 – Jan. 2014",
                "Manufacturing Company converting plastics, paper and cardboard into office use commodity goods. Cast extrusion of various types of films, welding, recycling, graphic industry post printing processes. Private label production for domestic and export markets.",
                employer2DutyList);

        employer3DutyList.add(new Duty(false, "All issues related to running a one-person enterprise, including:"));
        employer3DutyList.add(new Duty(false, "Purchasing"));
        employer3DutyList.add(new Duty(false, "In and out logistics"));
        employer3DutyList.add(new Duty(false, "Sales and marketing"));
        employer3DutyList.add(new Duty(false, "accountancy"));

        Employment employment3 = new Employment("ENTERPRENEUR",
                "MARKILO",
                "Wrocław, PL",
                "Apr. 2014 –",
                "Trade company importing and distributing writing instruments. One-Person Business.",
                employer3DutyList);

        employmentList.add(employment1);
        employmentList.add(employment2);
        employmentList.add(employment3);
    }
    public List<Employment> getEmploymentList (){
        return employmentList;
    }
}
