/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4994.706e115af modeling language!*/



/**
 * UML state machine diagram in Umple representing an automatic transmission
 * From Book by Lethbridge and Laganiere, McGraw Hill 2004
 * Object-Oriented Software Engineering: Practical Software Engineering using UML and Java
 * See http://www.lloseng.com
 */
// line 7 "model.ump"
// line 233 "model.ump"
// line 238 "model.ump"
public class SimpleCalculator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SimpleCalculator Attributes
  private float val_one;
  private String store;
  private boolean add;
  private boolean sub;
  private boolean mul;
  private boolean div;
  private boolean dec;
  private boolean pow;
  private boolean mod;
  private boolean pi;
  private boolean num;
  private boolean eul;
  private boolean sci;
  private boolean root;
  private boolean sqr;
  private boolean log;
  private boolean ln;
  private boolean fact;
  private boolean abs;
  private boolean inv;
  private boolean eql;
  private boolean isAddButtonPressed;
  private boolean isSubButtonPressed;
  private boolean isMulButtonPressed;
  private boolean isDivButtonPressed;
  private boolean isDecButtonPressed;
  private boolean isPowButtonPressed;
  private boolean isModButtonPressed;
  private boolean isPiButtonePressed;
  private boolean isNumButtonPressed;
  private boolean isEulButtonPressed;
  private boolean isSciButtonPressed;
  private boolean isRootButtonPressed;
  private boolean isSqrButtonPressed;
  private boolean isLogButtonPressed;
  private boolean isLnButtonPressed;
  private boolean isFactButtonPressed;
  private boolean isAbsButtonPressed;
  private boolean isInvButtonPressed;
  private boolean isEqualsButtonPressed;
  private boolean isClearBUttonPressed;
  private boolean isNegButtonPressed;
  private boolean error;
  private boolean screenRotated;

  //SimpleCalculator State Machines
  public enum CalculatorOperating { waiting, Normal, Scientific }
  public enum CalculatorOperatingNormal { Null, number, addition, subtraction, multiplication, division, equals, decimal, clear, negative }
  public enum CalculatorOperatingScientific { Null, pi, euler, absolute, inverse, factorial, ln, log, modulo, power, root, scientific, square }
  private CalculatorOperating calculatorOperating;
  private CalculatorOperatingNormal calculatorOperatingNormal;
  private CalculatorOperatingScientific calculatorOperatingScientific;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SimpleCalculator()
  {
    val_one = 0, val_two = 0, total = 0;
    store = "";
    add = false;
    sub = false;
    mul = false;
    div = false;
    dec = false;
    pow = false;
    mod = false;
    pi = false;
    num = false;
    eul = false;
    sci = false;
    root = false;
    sqr = false;
    log = false;
    ln = false;
    fact = false;
    abs = false;
    inv = false;
    eql = false;
    isAddButtonPressed = false;
    isSubButtonPressed = false;
    isMulButtonPressed = false;
    isDivButtonPressed = false;
    isDecButtonPressed = false;
    isPowButtonPressed = false;
    isModButtonPressed = false;
    isPiButtonePressed = false;
    isNumButtonPressed = false;
    isEulButtonPressed = false;
    isSciButtonPressed = false;
    isRootButtonPressed = false;
    isSqrButtonPressed = false;
    isLogButtonPressed = false;
    isLnButtonPressed = false;
    isFactButtonPressed = false;
    isAbsButtonPressed = false;
    isInvButtonPressed = false;
    isEqualsButtonPressed = false;
    isClearBUttonPressed = false;
    isNegButtonPressed = false;
    error = false;
    screenRotated = false;
    setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
    setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
    setCalculatorOperating(CalculatorOperating.waiting);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setVal_one(float aVal_one)
  {
    boolean wasSet = false;
    val_one = aVal_one;
    wasSet = true;
    return wasSet;
  }

  public boolean setStore(String aStore)
  {
    boolean wasSet = false;
    store = aStore;
    wasSet = true;
    return wasSet;
  }

  public boolean setAdd(boolean aAdd)
  {
    boolean wasSet = false;
    add = aAdd;
    wasSet = true;
    return wasSet;
  }

  public boolean setSub(boolean aSub)
  {
    boolean wasSet = false;
    sub = aSub;
    wasSet = true;
    return wasSet;
  }

  public boolean setMul(boolean aMul)
  {
    boolean wasSet = false;
    mul = aMul;
    wasSet = true;
    return wasSet;
  }

  public boolean setDiv(boolean aDiv)
  {
    boolean wasSet = false;
    div = aDiv;
    wasSet = true;
    return wasSet;
  }

  public boolean setDec(boolean aDec)
  {
    boolean wasSet = false;
    dec = aDec;
    wasSet = true;
    return wasSet;
  }

  public boolean setPow(boolean aPow)
  {
    boolean wasSet = false;
    pow = aPow;
    wasSet = true;
    return wasSet;
  }

  public boolean setMod(boolean aMod)
  {
    boolean wasSet = false;
    mod = aMod;
    wasSet = true;
    return wasSet;
  }

  public boolean setPi(boolean aPi)
  {
    boolean wasSet = false;
    pi = aPi;
    wasSet = true;
    return wasSet;
  }

  public boolean setNum(boolean aNum)
  {
    boolean wasSet = false;
    num = aNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setEul(boolean aEul)
  {
    boolean wasSet = false;
    eul = aEul;
    wasSet = true;
    return wasSet;
  }

  public boolean setSci(boolean aSci)
  {
    boolean wasSet = false;
    sci = aSci;
    wasSet = true;
    return wasSet;
  }

  public boolean setRoot(boolean aRoot)
  {
    boolean wasSet = false;
    root = aRoot;
    wasSet = true;
    return wasSet;
  }

  public boolean setSqr(boolean aSqr)
  {
    boolean wasSet = false;
    sqr = aSqr;
    wasSet = true;
    return wasSet;
  }

  public boolean setLog(boolean aLog)
  {
    boolean wasSet = false;
    log = aLog;
    wasSet = true;
    return wasSet;
  }

  public boolean setLn(boolean aLn)
  {
    boolean wasSet = false;
    ln = aLn;
    wasSet = true;
    return wasSet;
  }

  public boolean setFact(boolean aFact)
  {
    boolean wasSet = false;
    fact = aFact;
    wasSet = true;
    return wasSet;
  }

  public boolean setAbs(boolean aAbs)
  {
    boolean wasSet = false;
    abs = aAbs;
    wasSet = true;
    return wasSet;
  }

  public boolean setInv(boolean aInv)
  {
    boolean wasSet = false;
    inv = aInv;
    wasSet = true;
    return wasSet;
  }

  public boolean setEql(boolean aEql)
  {
    boolean wasSet = false;
    eql = aEql;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAddButtonPressed(boolean aIsAddButtonPressed)
  {
    boolean wasSet = false;
    isAddButtonPressed = aIsAddButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSubButtonPressed(boolean aIsSubButtonPressed)
  {
    boolean wasSet = false;
    isSubButtonPressed = aIsSubButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsMulButtonPressed(boolean aIsMulButtonPressed)
  {
    boolean wasSet = false;
    isMulButtonPressed = aIsMulButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDivButtonPressed(boolean aIsDivButtonPressed)
  {
    boolean wasSet = false;
    isDivButtonPressed = aIsDivButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDecButtonPressed(boolean aIsDecButtonPressed)
  {
    boolean wasSet = false;
    isDecButtonPressed = aIsDecButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsPowButtonPressed(boolean aIsPowButtonPressed)
  {
    boolean wasSet = false;
    isPowButtonPressed = aIsPowButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsModButtonPressed(boolean aIsModButtonPressed)
  {
    boolean wasSet = false;
    isModButtonPressed = aIsModButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsPiButtonePressed(boolean aIsPiButtonePressed)
  {
    boolean wasSet = false;
    isPiButtonePressed = aIsPiButtonePressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsNumButtonPressed(boolean aIsNumButtonPressed)
  {
    boolean wasSet = false;
    isNumButtonPressed = aIsNumButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsEulButtonPressed(boolean aIsEulButtonPressed)
  {
    boolean wasSet = false;
    isEulButtonPressed = aIsEulButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSciButtonPressed(boolean aIsSciButtonPressed)
  {
    boolean wasSet = false;
    isSciButtonPressed = aIsSciButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsRootButtonPressed(boolean aIsRootButtonPressed)
  {
    boolean wasSet = false;
    isRootButtonPressed = aIsRootButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSqrButtonPressed(boolean aIsSqrButtonPressed)
  {
    boolean wasSet = false;
    isSqrButtonPressed = aIsSqrButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLogButtonPressed(boolean aIsLogButtonPressed)
  {
    boolean wasSet = false;
    isLogButtonPressed = aIsLogButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLnButtonPressed(boolean aIsLnButtonPressed)
  {
    boolean wasSet = false;
    isLnButtonPressed = aIsLnButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsFactButtonPressed(boolean aIsFactButtonPressed)
  {
    boolean wasSet = false;
    isFactButtonPressed = aIsFactButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAbsButtonPressed(boolean aIsAbsButtonPressed)
  {
    boolean wasSet = false;
    isAbsButtonPressed = aIsAbsButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInvButtonPressed(boolean aIsInvButtonPressed)
  {
    boolean wasSet = false;
    isInvButtonPressed = aIsInvButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsEqualsButtonPressed(boolean aIsEqualsButtonPressed)
  {
    boolean wasSet = false;
    isEqualsButtonPressed = aIsEqualsButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsClearBUttonPressed(boolean aIsClearBUttonPressed)
  {
    boolean wasSet = false;
    isClearBUttonPressed = aIsClearBUttonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsNegButtonPressed(boolean aIsNegButtonPressed)
  {
    boolean wasSet = false;
    isNegButtonPressed = aIsNegButtonPressed;
    wasSet = true;
    return wasSet;
  }

  public boolean setError(boolean aError)
  {
    boolean wasSet = false;
    error = aError;
    wasSet = true;
    return wasSet;
  }

  public boolean setScreenRotated(boolean aScreenRotated)
  {
    boolean wasSet = false;
    screenRotated = aScreenRotated;
    wasSet = true;
    return wasSet;
  }

  public float getVal_one()
  {
    return val_one;
  }

  public String getStore()
  {
    return store;
  }

  public boolean getAdd()
  {
    return add;
  }

  public boolean getSub()
  {
    return sub;
  }

  public boolean getMul()
  {
    return mul;
  }

  public boolean getDiv()
  {
    return div;
  }

  public boolean getDec()
  {
    return dec;
  }

  public boolean getPow()
  {
    return pow;
  }

  public boolean getMod()
  {
    return mod;
  }

  public boolean getPi()
  {
    return pi;
  }

  public boolean getNum()
  {
    return num;
  }

  public boolean getEul()
  {
    return eul;
  }

  public boolean getSci()
  {
    return sci;
  }

  public boolean getRoot()
  {
    return root;
  }

  public boolean getSqr()
  {
    return sqr;
  }

  public boolean getLog()
  {
    return log;
  }

  public boolean getLn()
  {
    return ln;
  }

  public boolean getFact()
  {
    return fact;
  }

  public boolean getAbs()
  {
    return abs;
  }

  public boolean getInv()
  {
    return inv;
  }

  public boolean getEql()
  {
    return eql;
  }

  public boolean getIsAddButtonPressed()
  {
    return isAddButtonPressed;
  }

  public boolean getIsSubButtonPressed()
  {
    return isSubButtonPressed;
  }

  public boolean getIsMulButtonPressed()
  {
    return isMulButtonPressed;
  }

  public boolean getIsDivButtonPressed()
  {
    return isDivButtonPressed;
  }

  public boolean getIsDecButtonPressed()
  {
    return isDecButtonPressed;
  }

  public boolean getIsPowButtonPressed()
  {
    return isPowButtonPressed;
  }

  public boolean getIsModButtonPressed()
  {
    return isModButtonPressed;
  }

  public boolean getIsPiButtonePressed()
  {
    return isPiButtonePressed;
  }

  public boolean getIsNumButtonPressed()
  {
    return isNumButtonPressed;
  }

  public boolean getIsEulButtonPressed()
  {
    return isEulButtonPressed;
  }

  public boolean getIsSciButtonPressed()
  {
    return isSciButtonPressed;
  }

  public boolean getIsRootButtonPressed()
  {
    return isRootButtonPressed;
  }

  public boolean getIsSqrButtonPressed()
  {
    return isSqrButtonPressed;
  }

  public boolean getIsLogButtonPressed()
  {
    return isLogButtonPressed;
  }

  public boolean getIsLnButtonPressed()
  {
    return isLnButtonPressed;
  }

  public boolean getIsFactButtonPressed()
  {
    return isFactButtonPressed;
  }

  public boolean getIsAbsButtonPressed()
  {
    return isAbsButtonPressed;
  }

  public boolean getIsInvButtonPressed()
  {
    return isInvButtonPressed;
  }

  public boolean getIsEqualsButtonPressed()
  {
    return isEqualsButtonPressed;
  }

  public boolean getIsClearBUttonPressed()
  {
    return isClearBUttonPressed;
  }

  public boolean getIsNegButtonPressed()
  {
    return isNegButtonPressed;
  }

  public boolean getError()
  {
    return error;
  }

  public boolean getScreenRotated()
  {
    return screenRotated;
  }

  public String getCalculatorOperatingFullName()
  {
    String answer = calculatorOperating.toString();
    if (calculatorOperatingNormal != CalculatorOperatingNormal.Null) { answer += "." + calculatorOperatingNormal.toString(); }
    if (calculatorOperatingScientific != CalculatorOperatingScientific.Null) { answer += "." + calculatorOperatingScientific.toString(); }
    return answer;
  }

  public CalculatorOperating getCalculatorOperating()
  {
    return calculatorOperating;
  }

  public CalculatorOperatingNormal getCalculatorOperatingNormal()
  {
    return calculatorOperatingNormal;
  }

  public CalculatorOperatingScientific getCalculatorOperatingScientific()
  {
    return calculatorOperatingScientific;
  }

  public boolean numberButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (!(specialTest())&&!getAbs()&&!getEql())
        {
        // line 58 "model.ump"
          setIsNumButtonPressed(true);
          setCalculatorOperatingNormal(CalculatorOperatingNormal.number);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean additionButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        // line 59 "model.ump"
        setIsAddButtonPressed(true);
        setCalculatorOperatingNormal(CalculatorOperatingNormal.addition);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean subtractionButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        // line 60 "model.ump"
        setIsSubButtonPressed(true);
        setCalculatorOperatingNormal(CalculatorOperatingNormal.subtraction);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean multiplicationButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        // line 61 "model.ump"
        setIsMulButtonPressed(true);
        setCalculatorOperatingNormal(CalculatorOperatingNormal.multiplication);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean divisionButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        // line 62 "model.ump"
        setIsDivButtonPressed(true);
        setCalculatorOperatingNormal(CalculatorOperatingNormal.division);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean equalsButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getAdd()||getSub()||getMul()||getDiv()||getPow()||getMod())
        {
        // line 63 "model.ump"
          setIsEqualsButtonPressed(true);
          setCalculatorOperatingNormal(CalculatorOperatingNormal.equals);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean decimalButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (!getDec())
        {
        // line 64 "model.ump"
          setIsDecButtonPressed(true);
          setCalculatorOperatingNormal(CalculatorOperatingNormal.decimal);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean clearButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        // line 65 "model.ump"
        setIsClearButtonPressed(true);
        setCalculatorOperatingNormal(CalculatorOperatingNormal.clear);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean negativeButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        // line 66 "model.ump"
        setIsNegButtonPressed(true);
        setCalculatorOperatingNormal(CalculatorOperatingNormal.negative);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean piButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated()&&!getDec()||!getNum())
        {
        // line 67 "model.ump"
          setIsPiButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.pi);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean eulerButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated()&&!getDec()||!getNum())
        {
        // line 68 "model.ump"
          setIsEulButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.euler);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean absoluteButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 69 "model.ump"
          setIsAbsButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.absolute);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean inverseButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 70 "model.ump"
          setIsInvButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.inverse);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean factorialButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 71 "model.ump"
          setIsFactButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.factorial);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean lnButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 72 "model.ump"
          setIsLnButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.ln);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean logButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 73 "model.ump"
          setIsLogButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.log);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean moduloButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 74 "model.ump"
          setIsModButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.modulo);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean powerButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 75 "model.ump"
          setIsPowButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.power);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean rootButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 76 "model.ump"
          setIsRootButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.root);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean scientificButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 77 "model.ump"
          setIsSciButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.scientific);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean squareButtonPressed()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        if (getScreenRotated())
        {
        // line 78 "model.ump"
          setIsSqrButtonPressed(true);
          setCalculatorOperatingScientific(CalculatorOperatingScientific.square);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean rotateScreen()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperating aCalculatorOperating = calculatorOperating;
    switch (aCalculatorOperating)
    {
      case waiting:
        // line 79 "model.ump"
        setScreenRotated(!screenRotated)
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean numEnteredOnScreens()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingNormal aCalculatorOperatingNormal = calculatorOperatingNormal;
    switch (aCalculatorOperatingNormal)
    {
      case number:
        exitCalculatorOperating();
        // line 86 "model.ump"
        setNum(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean dataEnteredInList()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingNormal aCalculatorOperatingNormal = calculatorOperatingNormal;
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingNormal)
    {
      case addition:
        exitCalculatorOperating();
        // line 92 "model.ump"
        setAdd(true); setDec(false); setEql(false); negateBool("special");
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      case subtraction:
        exitCalculatorOperating();
        // line 99 "model.ump"
        setSub(true); setDec(false); setEql(false); negateBool("special");
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      case multiplication:
        exitCalculatorOperating();
        // line 106 "model.ump"
        setMul(true); setDec(false); setEql(false); negateBool("special");
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      case division:
        exitCalculatorOperating();
        // line 113 "model.ump"
        setDiv(true); setDec(false); setEql(false); negateBool("special");
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aCalculatorOperatingScientific)
    {
      case modulo:
        exitCalculatorOperating();
        // line 189 "model.ump"
        setMod(true); setDec(false); setEql(false); negateBool("special");
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      case power:
        exitCalculatorOperating();
        // line 195 "model.ump"
        setPow(true); setDec(false); setEql(false); negateBool("special");
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean dataClaculated()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingNormal aCalculatorOperatingNormal = calculatorOperatingNormal;
    switch (aCalculatorOperatingNormal)
    {
      case equals:
        exitCalculatorOperating();
        // line 120 "model.ump"
        setAdd(false); setSub(false); setMul(false); setDiv(false); setMod(false); setPow(false); setDec(true); setEql(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean decimalAddedToScreens()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingNormal aCalculatorOperatingNormal = calculatorOperatingNormal;
    switch (aCalculatorOperatingNormal)
    {
      case decimal:
        exitCalculatorOperating();
        // line 126 "model.ump"
        setDec(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean allDataCleared()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingNormal aCalculatorOperatingNormal = calculatorOperatingNormal;
    switch (aCalculatorOperatingNormal)
    {
      case clear:
        exitCalculatorOperating();
        // line 132 "model.ump"
        negateBool("all");
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean reverseSignOfDataEnteredOnScreens()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingNormal aCalculatorOperatingNormal = calculatorOperatingNormal;
    switch (aCalculatorOperatingNormal)
    {
      case negative:
        exitCalculatorOperating();
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean piEnteredOnScreens()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case pi:
        exitCalculatorOperating();
        // line 147 "model.ump"
        setDec(true); setPi(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean eulersConstantEnteredOnScreens()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case euler:
        exitCalculatorOperating();
        // line 153 "model.ump"
        setDec(true); setEul(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean absoluteValueCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case absolute:
        exitCalculatorOperating();
        // line 159 "model.ump"
        setAbs(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean inversMultaplicativeCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case inverse:
        exitCalculatorOperating();
        // line 165 "model.ump"
        setInv(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean factoralCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case factorial:
        exitCalculatorOperating();
        // line 171 "model.ump"
        setFact(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean lnCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case ln:
        exitCalculatorOperating();
        // line 177 "model.ump"
        setLn(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean logCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case log:
        exitCalculatorOperating();
        // line 183 "model.ump"
        setLog(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean rootCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case root:
        exitCalculatorOperating();
        // line 201 "model.ump"
        setRoot(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean scientificNotationCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case scientific:
        exitCalculatorOperating();
        // line 207 "model.ump"
        setSci(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean squareCarriedOutOnData()
  {
    boolean wasEventProcessed = false;
    
    CalculatorOperatingScientific aCalculatorOperatingScientific = calculatorOperatingScientific;
    switch (aCalculatorOperatingScientific)
    {
      case square:
        exitCalculatorOperating();
        // line 213 "model.ump"
        setSqr(true);
        setCalculatorOperating(CalculatorOperating.waiting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitCalculatorOperating()
  {
    switch(calculatorOperating)
    {
      case Normal:
        exitCalculatorOperatingNormal();
        break;
      case Scientific:
        exitCalculatorOperatingScientific();
        break;
    }
  }

  private void setCalculatorOperating(CalculatorOperating aCalculatorOperating)
  {
    calculatorOperating = aCalculatorOperating;

    // entry actions and do activities
    switch(calculatorOperating)
    {
      case waiting:
        // line 56 "model.ump"
        
        break;
      case Normal:
        if (calculatorOperatingNormal == CalculatorOperatingNormal.Null) { setCalculatorOperatingNormal(CalculatorOperatingNormal.number); }
        break;
      case Scientific:
        if (calculatorOperatingScientific == CalculatorOperatingScientific.Null) { setCalculatorOperatingScientific(CalculatorOperatingScientific.pi); }
        break;
    }
  }

  private void exitCalculatorOperatingNormal()
  {
    switch(calculatorOperatingNormal)
    {
      case number:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case addition:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case subtraction:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case multiplication:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case division:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case equals:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case decimal:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case clear:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
      case negative:
        setCalculatorOperatingNormal(CalculatorOperatingNormal.Null);
        break;
    }
  }

  private void setCalculatorOperatingNormal(CalculatorOperatingNormal aCalculatorOperatingNormal)
  {
    calculatorOperatingNormal = aCalculatorOperatingNormal;
    if (calculatorOperating != CalculatorOperating.Normal && aCalculatorOperatingNormal != CalculatorOperatingNormal.Null) { setCalculatorOperating(CalculatorOperating.Normal); }

    // entry actions and do activities
    switch(calculatorOperatingNormal)
    {
      case number:
        // line 83 "model.ump"
        setIsNumButtonPressed(false);
        break;
      case addition:
        // line 89 "model.ump"
        setIsAddButtonPressed(false);
        break;
      case subtraction:
        // line 96 "model.ump"
        setIsSubButtonPressed(false);
        break;
      case multiplication:
        // line 103 "model.ump"
        setIsMulButtonPressed(false);
        break;
      case division:
        // line 110 "model.ump"
        setIsDivButtonPressed(false);
        break;
      case equals:
        // line 117 "model.ump"
        setIsEqualsButtonPressed(false);
        break;
      case decimal:
        // line 123 "model.ump"
        setIsDecButtonPressed(false);
        break;
      case clear:
        // line 129 "model.ump"
        setIsClearButtonPressed(false);
        break;
      case negative:
        // line 135 "model.ump"
        setIsNegButtonPressed(false);
        break;
    }
  }

  private void exitCalculatorOperatingScientific()
  {
    switch(calculatorOperatingScientific)
    {
      case pi:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case euler:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case absolute:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case inverse:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case factorial:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case ln:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case log:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case modulo:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case power:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case root:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case scientific:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
      case square:
        setCalculatorOperatingScientific(CalculatorOperatingScientific.Null);
        break;
    }
  }

  private void setCalculatorOperatingScientific(CalculatorOperatingScientific aCalculatorOperatingScientific)
  {
    calculatorOperatingScientific = aCalculatorOperatingScientific;
    if (calculatorOperating != CalculatorOperating.Scientific && aCalculatorOperatingScientific != CalculatorOperatingScientific.Null) { setCalculatorOperating(CalculatorOperating.Scientific); }

    // entry actions and do activities
    switch(calculatorOperatingScientific)
    {
      case pi:
        // line 144 "model.ump"
        setIsPiButtonPressed(false);
        break;
      case euler:
        // line 150 "model.ump"
        setIsEulButtonPressed(false);
        break;
      case absolute:
        // line 156 "model.ump"
        setIsAbsButtonPressed(false);
        break;
      case inverse:
        // line 162 "model.ump"
        setIsInvButtonPressed(false);
        break;
      case factorial:
        // line 168 "model.ump"
        setIsFactButtonPressed(false);
        break;
      case ln:
        // line 174 "model.ump"
        setIsLnButtonPressed(false);
        break;
      case log:
        // line 180 "model.ump"
        setIsLogButtonPressed(false);
        break;
      case modulo:
        // line 186 "model.ump"
        setIsModButtonPressed(false);
        break;
      case power:
        // line 192 "model.ump"
        setIsPowButtonPressed(false);
        break;
      case root:
        // line 198 "model.ump"
        setIsRootButtonPressed(false);
        break;
      case scientific:
        // line 204 "model.ump"
        setIsSciButtonPressed(false);
        break;
      case square:
        // line 210 "model.ump"
        setIsSqrButtonPressed(false);
        break;
    }
  }

  public void delete()
  {}

  // line 219 "model.ump"
   protected void negateBool(String check){
    if(check.equals("all"))
         add=sub=mul=div=dec=pow=mod=pi=num=eul=sci=root=sqr=log=ln=fact=abs=inv=eql=false;
      if(check.equals("special"))
         pi=num=eul=sci=root=sqr=log=ln=fact=abs=inv=false;
  }

  // line 225 "model.ump"
   protected boolean specialTest(){
    return pi||eul||sci||root||sqr||log||ln||fact||inv;
  }


  public String toString()
  {
    return super.toString() + "["+
            "val_one" + ":" + getVal_one()+ "," +
            "store" + ":" + getStore()+ "," +
            "add" + ":" + getAdd()+ "," +
            "sub" + ":" + getSub()+ "," +
            "mul" + ":" + getMul()+ "," +
            "div" + ":" + getDiv()+ "," +
            "dec" + ":" + getDec()+ "," +
            "pow" + ":" + getPow()+ "," +
            "mod" + ":" + getMod()+ "," +
            "pi" + ":" + getPi()+ "," +
            "num" + ":" + getNum()+ "," +
            "eul" + ":" + getEul()+ "," +
            "sci" + ":" + getSci()+ "," +
            "root" + ":" + getRoot()+ "," +
            "sqr" + ":" + getSqr()+ "," +
            "log" + ":" + getLog()+ "," +
            "ln" + ":" + getLn()+ "," +
            "fact" + ":" + getFact()+ "," +
            "abs" + ":" + getAbs()+ "," +
            "inv" + ":" + getInv()+ "," +
            "eql" + ":" + getEql()+ "," +
            "isAddButtonPressed" + ":" + getIsAddButtonPressed()+ "," +
            "isSubButtonPressed" + ":" + getIsSubButtonPressed()+ "," +
            "isMulButtonPressed" + ":" + getIsMulButtonPressed()+ "," +
            "isDivButtonPressed" + ":" + getIsDivButtonPressed()+ "," +
            "isDecButtonPressed" + ":" + getIsDecButtonPressed()+ "," +
            "isPowButtonPressed" + ":" + getIsPowButtonPressed()+ "," +
            "isModButtonPressed" + ":" + getIsModButtonPressed()+ "," +
            "isPiButtonePressed" + ":" + getIsPiButtonePressed()+ "," +
            "isNumButtonPressed" + ":" + getIsNumButtonPressed()+ "," +
            "isEulButtonPressed" + ":" + getIsEulButtonPressed()+ "," +
            "isSciButtonPressed" + ":" + getIsSciButtonPressed()+ "," +
            "isRootButtonPressed" + ":" + getIsRootButtonPressed()+ "," +
            "isSqrButtonPressed" + ":" + getIsSqrButtonPressed()+ "," +
            "isLogButtonPressed" + ":" + getIsLogButtonPressed()+ "," +
            "isLnButtonPressed" + ":" + getIsLnButtonPressed()+ "," +
            "isFactButtonPressed" + ":" + getIsFactButtonPressed()+ "," +
            "isAbsButtonPressed" + ":" + getIsAbsButtonPressed()+ "," +
            "isInvButtonPressed" + ":" + getIsInvButtonPressed()+ "," +
            "isEqualsButtonPressed" + ":" + getIsEqualsButtonPressed()+ "," +
            "isClearBUttonPressed" + ":" + getIsClearBUttonPressed()+ "," +
            "isNegButtonPressed" + ":" + getIsNegButtonPressed()+ "," +
            "error" + ":" + getError()+ "," +
            "screenRotated" + ":" + getScreenRotated()+ "]";
  }
}