package gui;

/**
 * A GUI Component which sends data to Receiver (listener) components when it is interacted with.
 * 
 * IGUIDataComponents are closely linked with IGUIDataRecievers.
 * Typically a GUIComponent will notify its receivers (via notifyRecievers() ) when it is interacted
 * with by the user.  For example, a user may check a box or move a slider, which are represented by
 * IGUIDataComponents.  When checked or moved, they will notify their receivers of this interaction
 * by sending them some Object (arg) describing the interaction.  The receivers will then take some
 * action depending on the data given.
 * 
 * @author Chris
 *
 */
public interface IGUIDataComponent extends IGUIComponent {
	
	/** 
	 * Add a receiver to receive updates from this data component 
	 **/
	public void addReceiver(IGUIDataReceiver r);
	
	/**
	 *  Notify receivers about changes to this object 
	 **/
	public void notifyReceivers(Object arg);
	
}
