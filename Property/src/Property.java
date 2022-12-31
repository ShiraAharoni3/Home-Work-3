    public class Property
    {
        private
        int Room ;
        String Street ;
        String City ;
        int Price ;
        int Kind ;
        int BuyingOrRenting ;
        int HomeNumber ;
        int FloorNumber ;
        String TheUserThatPublishTheProperty ;

        public
        Property( String City_Name , String Street_Name, int Home_number , int Floor_Number , int Room_number ,
                   int Kind_Of_Property , int Price_ , int Renting , String User_Name_Publish )
        {
            City = City_Name ;
            Street = Street_Name ;
            Room = Room_number ;
            Price = Price_ ;
            Kind = Kind_Of_Property ;
            BuyingOrRenting = Renting ;
            HomeNumber = Home_number ;
            FloorNumber = Floor_Number ;
            TheUserThatPublishTheProperty = User_Name_Publish ;

        }
        void ShowPropertyDetails()
        {
            System.out.printf("City Name: %s\nStreet Name:  %s\nRoom Number:  %d\nPrice:  %s\nKind of property: %s\n" +
                    "Offered for rent: %s\nHome NUmber: %s\nFloor Number: %d\nThe user publish: %s\n" ,  City , Street ,
                         Room ,Price ,Kind ,BuyingOrRenting ,HomeNumber ,FloorNumber ,TheUserThatPublishTheProperty );

        }

        public void PropertyDetails(int floor, int numOfRoom, int numOfProperty, String thePropertyIsForSaleOrRent, int propertyPrice) {
        }
    }
