package gui;

/**
 * IGUIDataReceivers receive changes to IGUIDataComponents and act on them in some fashion.
 * 
 * IGUIDataReceivers are closesly linked to IGUIDataComponents.
 * Typically a GUIComponent will notify its receivers (via notifyRecievers() ) when it is interacted
 * with by the user.  For example, a user may check a box or move a slider, which are represented by
 * IGUIDataComponents.  When checked or moved, they will notify their receivers of this interaction
 * by sending them some Object (arg) describing the interaction.  The receivers will then take some
 * action depending on the data given (via update() ).
 * 
 * @author Chris
 *
 * @param <ID> An object used to identify which DataComponent a message came from.
 */
public interface IGUIDataReceiver<ID>{
	
	/**
	 *  Registers an IGUIDataComponent to give input to this receiver with the ID id 
	 */
	public void registerDataInput(ID id, IGUIDataComponent c);
	
	/** 
	 * 	Notify this receiver about updates from a DataComponent 
	 *
	 *	@param c The component from which the update message came
	 *	@param arg The update message data
	 */
	public void notify(IGUIDataComponent c, Object arg);
	
	/**
	 *  Update this receiver using the argument given by the DataComponent associated with the ID id 
	 */
	public void update(ID id, Object arg);
	
}
