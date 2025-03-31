import mangal.array.*;
class SolutionArray
{
	public static void main(String args[])
    {
        Array ob = new Array();
        ob.create(5);
        ob.display();
        
        //ob.evenArray();
        
        //ob.oddArray();

        //System.out.println("Sum of Array = "+ob.sumOfArray());
        //System.out.println("Sum of Even Number = "+ob.sumOfEvenNumber());
        //System.out.println("Sum of Odd Number = "+ob.sumOfOddNumber());

        //ob.removeDuplicateValue();

        //ob.sort();
        //ob.sortreverse();
        //System.out.println(ob.searchbyindex(2));
        //System.out.println(ob.searchbyelement(6));
        //ob.searchbyelements(6);
        //ob.insertelement(5,2);
        //ob.deletelementbyposition(3);
        //ob.deletelement(5);
        ob.primeArray();
    }
}