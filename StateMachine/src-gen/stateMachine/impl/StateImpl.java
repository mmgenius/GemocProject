/**
 */
package stateMachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import stateMachine.State;
import stateMachine.StateMachinePackage;
import stateMachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link stateMachine.impl.StateImpl#getTargetOut <em>Target Out</em>}</li>
 *   <li>{@link stateMachine.impl.StateImpl#getFromIn <em>From In</em>}</li>
 *   <li>{@link stateMachine.impl.StateImpl#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetOut() <em>Target Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOut()
	 * @generated
	 * @ordered
	 */
	protected Transition targetOut;

	/**
	 * The cached value of the '{@link #getFromIn() <em>From In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIn()
	 * @generated
	 * @ordered
	 */
	protected Transition fromIn;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTargetOut() {
		if (targetOut != null && targetOut.eIsProxy()) {
			InternalEObject oldTargetOut = (InternalEObject) targetOut;
			targetOut = (Transition) eResolveProxy(oldTargetOut);
			if (targetOut != oldTargetOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.STATE__TARGET_OUT,
							oldTargetOut, targetOut));
			}
		}
		return targetOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTargetOut() {
		return targetOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetOut(Transition newTargetOut, NotificationChain msgs) {
		Transition oldTargetOut = targetOut;
		targetOut = newTargetOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StateMachinePackage.STATE__TARGET_OUT, oldTargetOut, newTargetOut);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOut(Transition newTargetOut) {
		if (newTargetOut != targetOut) {
			NotificationChain msgs = null;
			if (targetOut != null)
				msgs = ((InternalEObject) targetOut).eInverseRemove(this, StateMachinePackage.TRANSITION__FROM,
						Transition.class, msgs);
			if (newTargetOut != null)
				msgs = ((InternalEObject) newTargetOut).eInverseAdd(this, StateMachinePackage.TRANSITION__FROM,
						Transition.class, msgs);
			msgs = basicSetTargetOut(newTargetOut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__TARGET_OUT, newTargetOut,
					newTargetOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getFromIn() {
		if (fromIn != null && fromIn.eIsProxy()) {
			InternalEObject oldFromIn = (InternalEObject) fromIn;
			fromIn = (Transition) eResolveProxy(oldFromIn);
			if (fromIn != oldFromIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.STATE__FROM_IN,
							oldFromIn, fromIn));
			}
		}
		return fromIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetFromIn() {
		return fromIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromIn(Transition newFromIn, NotificationChain msgs) {
		Transition oldFromIn = fromIn;
		fromIn = newFromIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StateMachinePackage.STATE__FROM_IN, oldFromIn, newFromIn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIn(Transition newFromIn) {
		if (newFromIn != fromIn) {
			NotificationChain msgs = null;
			if (fromIn != null)
				msgs = ((InternalEObject) fromIn).eInverseRemove(this, StateMachinePackage.TRANSITION__TARGET,
						Transition.class, msgs);
			if (newFromIn != null)
				msgs = ((InternalEObject) newFromIn).eInverseAdd(this, StateMachinePackage.TRANSITION__TARGET,
						Transition.class, msgs);
			msgs = basicSetFromIn(newFromIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__FROM_IN, newFromIn,
					newFromIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.STATE__TARGET_OUT:
			if (targetOut != null)
				msgs = ((InternalEObject) targetOut).eInverseRemove(this, StateMachinePackage.TRANSITION__FROM,
						Transition.class, msgs);
			return basicSetTargetOut((Transition) otherEnd, msgs);
		case StateMachinePackage.STATE__FROM_IN:
			if (fromIn != null)
				msgs = ((InternalEObject) fromIn).eInverseRemove(this, StateMachinePackage.TRANSITION__TARGET,
						Transition.class, msgs);
			return basicSetFromIn((Transition) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.STATE__TARGET_OUT:
			return basicSetTargetOut(null, msgs);
		case StateMachinePackage.STATE__FROM_IN:
			return basicSetFromIn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StateMachinePackage.STATE__NAME:
			return getName();
		case StateMachinePackage.STATE__TARGET_OUT:
			if (resolve)
				return getTargetOut();
			return basicGetTargetOut();
		case StateMachinePackage.STATE__FROM_IN:
			if (resolve)
				return getFromIn();
			return basicGetFromIn();
		case StateMachinePackage.STATE__STATUS:
			return isStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StateMachinePackage.STATE__NAME:
			setName((String) newValue);
			return;
		case StateMachinePackage.STATE__TARGET_OUT:
			setTargetOut((Transition) newValue);
			return;
		case StateMachinePackage.STATE__FROM_IN:
			setFromIn((Transition) newValue);
			return;
		case StateMachinePackage.STATE__STATUS:
			setStatus((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StateMachinePackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StateMachinePackage.STATE__TARGET_OUT:
			setTargetOut((Transition) null);
			return;
		case StateMachinePackage.STATE__FROM_IN:
			setFromIn((Transition) null);
			return;
		case StateMachinePackage.STATE__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StateMachinePackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StateMachinePackage.STATE__TARGET_OUT:
			return targetOut != null;
		case StateMachinePackage.STATE__FROM_IN:
			return fromIn != null;
		case StateMachinePackage.STATE__STATUS:
			return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //StateImpl
