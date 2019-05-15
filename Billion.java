class Billion{
        public static void main(String args[])
        {
                try{
                for (long num = 0; num < 1000000000000L; num++){
                        throw new Exception("demo");            
                }
                }
                catch (Exception e)
                {
                        System.out.println("Memory out of bound");
                }
        }
}