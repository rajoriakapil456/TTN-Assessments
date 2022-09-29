import java.util.*;
class SpecialStack 
{
        Integer me=1000000000;
	@Override
	public String toString() 
	{
		return "SpecialStack [elements=" + elements + "]";
	}
	private List<Integer> elements = new ArrayList<>();
	public Integer peek() 
	{
		if (elements.isEmpty()) 
		{
			return null;
		}
		return elements.get(elements.size() - 1);
	}
	
	public Integer pop() 
	{
		if (elements.isEmpty()) 
		{
			return null;
		}
		Integer top = elements.get(elements.size() - 1);
		elements.remove(elements.size() - 1);
		return top;
	}
	public void push(Integer element) 
	{
	       elements.add(element);
	       if(element<me)
	       {
	          me=element;
	       }
	}
	public int size() 
	{
		return elements.size();
	}
	public boolean isEmpty() 
	{
		return elements.isEmpty();
	}
	public void getMin()
	{
	     if(elements.isEmpty())
	     {
	       System.out.println("Stack is empty!");
	     }
	     else
	     {
	        System.out.println("Minimum Element in the stack is: "+me);
	     }
	}
	
	public static void main(String[] args) 
	{
		
		SpecialStack s = new SpecialStack();
		System.out.println("Is SpecialStack Empty:"+s.isEmpty());
		s.push(10);
		s.push(30);
		s.push(20);
		s.push(50);
		s.getMin();
		//System.out.println(getMin(s));
		System.out.println("Is SpecialStack Empty:"+s.isEmpty());
		System.out.println(s);
		System.out.println("SpecialStack Size:"+s.size());
		System.out.println("Peek Top Element:"+s.peek());
		System.out.println("After peek:"+s);
		System.out.println("Pop Top Element:"+s.pop());
		System.out.println("After pop:"+s);
		System.out.println("SpecialStack Size now:"+s.size());
		
	}
}
