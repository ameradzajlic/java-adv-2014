package com.voteapp; 
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
  @Test
  public void testDao(){
    try {
		com.voteapp.Dao dao = new com.voteapp.Dao();
		dao.connect();
		boolean daostate = dao.conn.isClosed();
		Assert.assertEquals(daostate,false);
		Assert.assertEquals(ArrayList.class, dao.getAnswersCount().getClass()); 
    } catch(Exception ex){
	    Assert.fail("Invalid connection"); 
    }
  }
}
