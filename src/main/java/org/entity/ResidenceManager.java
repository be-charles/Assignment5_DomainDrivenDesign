package org.entity;

public class ResidenceManager {
    //Luzuko

    private int managerId;
    private String firstName, lastName;



    private ResidenceManager(Builder builder)
    {
      this.managerId = builder.managerId;
      this.firstName = builder.firstName;
      this.lastName = builder.lastName;
    }

    public int getManagerId()
    {
        return managerId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String toString()
    {
        return "ResidenceManager{" +
                "managerId=" + managerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder
    {

        private int managerId;
        private String firstName, lastName;


        public Builder setManagerId(int managerId)
        {

            this.managerId = managerId;
            return this;
        }

        public Builder setFirstName(String firstName)
        {

            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName)
        {

            this.lastName = lastName;
            return this;
        }

        public  Builder copy(ResidenceManager residenceManager)
        {

            this.managerId = residenceManager.managerId;
            this.firstName = residenceManager.firstName;
            this.lastName = residenceManager.lastName;
            return this;
        }


        public ResidenceManager build()

        {

            return new ResidenceManager(this);

        }

    }
}
