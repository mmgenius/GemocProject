/**
 */
package stateMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.State#getName <em>Name</em>}</li>
 *   <li>{@link stateMachine.State#getTargetOut <em>Target Out</em>}</li>
 *   <li>{@link stateMachine.State#getFromIn <em>From In</em>}</li>
 *   <li>{@link stateMachine.State#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stateMachine.StateMachinePackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stateMachine.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Out</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stateMachine.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Out</em>' reference.
	 * @see #setTargetOut(Transition)
	 * @see stateMachine.StateMachinePackage#getState_TargetOut()
	 * @see stateMachine.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	Transition getTargetOut();

	/**
	 * Sets the value of the '{@link stateMachine.State#getTargetOut <em>Target Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Out</em>' reference.
	 * @see #getTargetOut()
	 * @generated
	 */
	void setTargetOut(Transition value);

	/**
	 * Returns the value of the '<em><b>From In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stateMachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From In</em>' reference.
	 * @see #setFromIn(Transition)
	 * @see stateMachine.StateMachinePackage#getState_FromIn()
	 * @see stateMachine.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Transition getFromIn();

	/**
	 * Sets the value of the '{@link stateMachine.State#getFromIn <em>From In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From In</em>' reference.
	 * @see #getFromIn()
	 * @generated
	 */
	void setFromIn(Transition value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see stateMachine.StateMachinePackage#getState_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link stateMachine.State#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

} // State
