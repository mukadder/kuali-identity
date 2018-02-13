package com.example.testSoap.wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.2.8.3
//
// Created by Quasar Development 
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class VEFLessThanOrEqualType extends VEFabstractPredicate implements KvmSerializable
{

    
    public String stringValue;
    
    public VEFCriteriaPropertyPathValueType propertyPathValue;
    
    public BigDecimal decimalValue=BigDecimal.ZERO;
    
    public BigDecimal kualiDecimalValue=BigDecimal.ZERO;
    
    public BigDecimal kualiPercentValue=BigDecimal.ZERO;
    
    public BigInteger kualiIntegerValue=BigInteger.ZERO;
    
    public BigInteger integerValue=BigInteger.ZERO;
    
    public java.util.Date dateTimeValue;
    
    public String propertyPath;
    

    
    
    @Override
    public void loadFromSoap(java.lang.Object paramObj,VEFExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        super.loadFromSoap(paramObj, __envelope);
        if (inObj.hasAttribute("propertyPath"))
        {	
            java.lang.Object j = inObj.getAttribute("propertyPath");
            if (j != null)
            {
                propertyPath = j.toString();
            }
        }

    }

    @Override
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,VEFExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("stringValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.stringValue = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.stringValue = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("propertyPathValue"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.propertyPathValue = (VEFCriteriaPropertyPathValueType)__envelope.get(j,VEFCriteriaPropertyPathValueType.class,false);
            }
            return true;
        }
        if (info.name.equals("decimalValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.decimalValue = new BigDecimal(j.toString());
                    }
                }
                else if (obj instanceof BigDecimal){
                    this.decimalValue = (BigDecimal)obj;
                }
            }
            return true;
        }
        if (info.name.equals("kualiDecimalValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.kualiDecimalValue = new BigDecimal(j.toString());
                    }
                }
                else if (obj instanceof BigDecimal){
                    this.kualiDecimalValue = (BigDecimal)obj;
                }
            }
            return true;
        }
        if (info.name.equals("kualiPercentValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.kualiPercentValue = new BigDecimal(j.toString());
                    }
                }
                else if (obj instanceof BigDecimal){
                    this.kualiPercentValue = (BigDecimal)obj;
                }
            }
            return true;
        }
        if (info.name.equals("kualiIntegerValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.kualiIntegerValue = new BigInteger(j.toString());
                    }
                }
                else if (obj instanceof BigInteger){
                    this.kualiIntegerValue = (BigInteger)obj;
                }
            }
            return true;
        }
        if (info.name.equals("integerValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.integerValue = new BigInteger(j.toString());
                    }
                }
                else if (obj instanceof BigInteger){
                    this.integerValue = (BigInteger)obj;
                }
            }
            return true;
        }
        if (info.name.equals("dateTimeValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.dateTimeValue = VEFHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.dateTimeValue = (java.util.Date)obj;
                }
            }
            return true;
        }
        return super.loadProperty(info,soapObject,__envelope);
    }
    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return stringValue;
        }
        if(propertyIndex==count+1)
        {
            return propertyPathValue;
        }
        if(propertyIndex==count+2)
        {
            return this.decimalValue!=null?this.decimalValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.kualiDecimalValue!=null?this.kualiDecimalValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.kualiPercentValue!=null?this.kualiPercentValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.kualiIntegerValue!=null?this.kualiIntegerValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.integerValue!=null?this.integerValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.dateTimeValue!=null?VEFHelper.getDateTimeFormat().format(this.dateTimeValue):SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "stringValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+1)
        {
            info.type = VEFCriteriaPropertyPathValueType.class;
            info.name = "propertyPathValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "decimalValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "kualiDecimalValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "kualiPercentValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "kualiIntegerValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "integerValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateTimeValue";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }



    @Override
    public int getAttributeCount() {
        return 1;
    }
    
    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if(index==0)
        {
            info.name = "propertyPath";
            info.namespace= "";
            if(this.propertyPath!=null)
            {
                info.setValue(this.propertyPath);
            }
            
        }
    }

    @Override
    public void getAttribute(int i, AttributeInfo attributeInfo) {

    }

    @Override
    public void setAttribute(AttributeInfo attributeInfo) {

    }    
}

