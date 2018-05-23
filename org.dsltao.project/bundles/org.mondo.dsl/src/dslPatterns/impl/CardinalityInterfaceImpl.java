/**
 */
package dslPatterns.impl;

import dslPatterns.CardinalityInterface;
import dslPatterns.DslPatternsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslPatterns.impl.CardinalityInterfaceImpl#isAnyMin <em>Any Min</em>}</li>
 *   <li>{@link dslPatterns.impl.CardinalityInterfaceImpl#isAnyMax <em>Any Max</em>}</li>
 *   <li>{@link dslPatterns.impl.CardinalityInterfaceImpl#isAnyOrdering <em>Any Ordering</em>}</li>
 *   <li>{@link dslPatterns.impl.CardinalityInterfaceImpl#isUniqueMatters <em>Unique Matters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CardinalityInterfaceImpl extends EObjectImpl implements CardinalityInterface {
	/**
	 * The default value of the '{@link #isAnyMin() <em>Any Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyMin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_MIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyMin() <em>Any Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyMin()
	 * @generated
	 * @ordered
	 */
	protected boolean anyMin = ANY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnyMax() <em>Any Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyMax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_MAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyMax() <em>Any Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyMax()
	 * @generated
	 * @ordered
	 */
	protected boolean anyMax = ANY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnyOrdering() <em>Any Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_ORDERING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyOrdering() <em>Any Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyOrdering()
	 * @generated
	 * @ordered
	 */
	protected boolean anyOrdering = ANY_ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUniqueMatters() <em>Unique Matters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueMatters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_MATTERS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUniqueMatters() <em>Unique Matters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueMatters()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueMatters = UNIQUE_MATTERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPatternsPackage.Literals.CARDINALITY_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnyMin() {
		return anyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnyMin(boolean newAnyMin) {
		boolean oldAnyMin = anyMin;
		anyMin = newAnyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MIN, oldAnyMin, anyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnyMax() {
		return anyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnyMax(boolean newAnyMax) {
		boolean oldAnyMax = anyMax;
		anyMax = newAnyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MAX, oldAnyMax, anyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnyOrdering() {
		return anyOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnyOrdering(boolean newAnyOrdering) {
		boolean oldAnyOrdering = anyOrdering;
		anyOrdering = newAnyOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.CARDINALITY_INTERFACE__ANY_ORDERING, oldAnyOrdering, anyOrdering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueMatters() {
		return uniqueMatters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueMatters(boolean newUniqueMatters) {
		boolean oldUniqueMatters = uniqueMatters;
		uniqueMatters = newUniqueMatters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.CARDINALITY_INTERFACE__UNIQUE_MATTERS, oldUniqueMatters, uniqueMatters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MIN:
				return isAnyMin();
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MAX:
				return isAnyMax();
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_ORDERING:
				return isAnyOrdering();
			case DslPatternsPackage.CARDINALITY_INTERFACE__UNIQUE_MATTERS:
				return isUniqueMatters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MIN:
				setAnyMin((Boolean)newValue);
				return;
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MAX:
				setAnyMax((Boolean)newValue);
				return;
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_ORDERING:
				setAnyOrdering((Boolean)newValue);
				return;
			case DslPatternsPackage.CARDINALITY_INTERFACE__UNIQUE_MATTERS:
				setUniqueMatters((Boolean)newValue);
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
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MIN:
				setAnyMin(ANY_MIN_EDEFAULT);
				return;
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MAX:
				setAnyMax(ANY_MAX_EDEFAULT);
				return;
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_ORDERING:
				setAnyOrdering(ANY_ORDERING_EDEFAULT);
				return;
			case DslPatternsPackage.CARDINALITY_INTERFACE__UNIQUE_MATTERS:
				setUniqueMatters(UNIQUE_MATTERS_EDEFAULT);
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
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MIN:
				return anyMin != ANY_MIN_EDEFAULT;
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_MAX:
				return anyMax != ANY_MAX_EDEFAULT;
			case DslPatternsPackage.CARDINALITY_INTERFACE__ANY_ORDERING:
				return anyOrdering != ANY_ORDERING_EDEFAULT;
			case DslPatternsPackage.CARDINALITY_INTERFACE__UNIQUE_MATTERS:
				return uniqueMatters != UNIQUE_MATTERS_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (anyMin: ");
		result.append(anyMin);
		result.append(", anyMax: ");
		result.append(anyMax);
		result.append(", anyOrdering: ");
		result.append(anyOrdering);
		result.append(", uniqueMatters: ");
		result.append(uniqueMatters);
		result.append(')');
		return result.toString();
	}

} //CardinalityInterfaceImpl
