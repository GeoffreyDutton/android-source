package com.bloc.singletons;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *	ASSIGNMENT:
 *	Populate this class with the defined methods.
 *
 *	This is a singleton class which maintains communication
 *	between Talker and Listener interface objects.
/************************************************/

public class Speakerphone extends Object {
	private static Speakerphone sSpeakerphone;

	public static Speakerphone get()
	{
		if (sSpeakerphone == null)
		{
			sSpeakerphone = new Speakerphone();
		}
		return sSpeakerphone;
	}
	/*
	 * get
	 *
	 * @return the singleton instance of Speakerphone (Speakerphone)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the get method
	/************************************************/

	private ArrayList<Listener> mSpeakerphones;

	private Speakerphone()
	{
		mSpeakerphones = new ArrayList<Listener>();
	}
public void addListener(Listener listener)
{
	mSpeakerphones.add(listener);
}
	/*
	 * addListener
	 *
	 * Add a listener to Speakerphone's list
	 *
	 * @param listener an instance of the Listener interface (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the addListener method
	/************************************************/
public void removeListener(Listener listener)
	{
		mSpeakerphones.remove(listener);
	}
	/*
	 * removeListener
	 *
	 * Remove a Listener from the Speakerphone's list
	 *
	 * @param listener the Listener to remove (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeListener method
	/************************************************/
public void removeAll()
{
	mSpeakerphones.clear();
}
	/*
	 * removeAll
	 *
	 * Removes all Listeners from Speakerphone
	 *
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeAll method
	/************************************************/

	/*
	 * contains
	 *
	 * Checks whether a Listener is found in the Speakerphone's
	 * collection.
	 *
	 * @param listener
	 * @return `true` if the Listener has already been added to
	 *		   the Speakerphone, `false` otherwise (boolean)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the contains method
	/************************************************/	
public boolean contains(Listener listener)
{
	if (mSpeakerphones.contains(listener))
	{
		return true;
	}
	else return false;
}
	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/
public void shoutMessage(Talker talker)
{
	for(Listener listener: mSpeakerphones)
	{
		talker.getMessage();
	}
}
	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners which are instances of
	 * the cls parameter
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message (Class)
	 * @return nothing
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/
public void shoutMessage(Talker talker, Class cls) {

		for(Listener listener : mSpeakerphones)
		{
			if(cls.isAssignableFrom(listener.getClass()))
			{
				talker.getMessage();
			}
		}
	}

}