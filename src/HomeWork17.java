
public class HomeWork17 {

    public static void main(String[] args) {

         ClientsAccount client1 = new ClientsAccount("Taras", "Shevchenko", "Shavs@gmail.com",
                 "+380504561943", 9,03,1974, 83,90,
                 120, 3000);

         ClientsAccount client2 = new ClientsAccount("Constantin", "Byk", "ByrKostia@ukr.net",
                 "+380972303272", 10,07, 1983, 76, 88,
                 110, 5500);

        ClientsAccount client3 = new ClientsAccount("Irina", "Kobzar", "KobzarIri@gmail.com",
                "+380985871943", 18,8, 1959, 73, 93,
                121, 2500);

        ClientsAccount client4 = new ClientsAccount("Alex", "Bisheb", "Alex89B@gmail.com",
                "+380667718925", 31,10, 1989, 101, 95,
                130, 5500);

        ClientsAccount client5 = new ClientsAccount("Kristina", "Bakhareva", "KrisBah@gmail.com",
                "+380967311231", 15,4, 1995, 63, 75,
                110, 6500);


        client1.printAccountInfo();
        client2.printAccountInfo();
        client3.printAccountInfo();
        client4.printAccountInfo();
        client5.printAccountInfo();

        client3.newLife("Segalova", 70,80,115,8000);



        //client3.lastName = "Segalova";
        //client3.pressureSystolic = 80;
        //client3.pressureDiastolic = 110;
        //client3.weight = 76;
        //client3.stepsByDay = 5500;

        client3.printAccountInfo();

        client5.checkYourLife("Volkova",66,85,115,7000);
        client5.printAccountInfo();






    }



    }


