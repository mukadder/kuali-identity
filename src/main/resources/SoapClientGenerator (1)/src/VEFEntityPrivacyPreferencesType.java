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

public class VEFEntityPrivacyPreferencesType extends AttributeContainer implements KvmSerializable
{

    
    public String entityId;
    
    public Boolean suppressName=false;
    
    public Boolean suppressAddress=false;
    
    public Boolean suppressEmail=false;
    
    public Boolean suppressPhone=false;
    
    public Boolean suppressPersonal=false;
    
    public Long versionNumber;
    
    public String objectId;
    private transient java.lang.Object __source;    
    

    
    
    
    public void loadFromSoap(java.lang.Object paramObj,VEFExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                }
            } 
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,VEFExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("entityId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.entityId = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.entityId = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("suppressName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.suppressName = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.suppressName = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("suppressAddress"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.suppressAddress = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.suppressAddress = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("suppressEmail"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.suppressEmail = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.suppressEmail = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("suppressPhone"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.suppressPhone = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.suppressPhone = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("suppressPersonal"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.suppressPersonal = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.suppressPersonal = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("versionNumber"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.versionNumber = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.versionNumber = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("objectId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.objectId = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.objectId = (String)obj;
                }
            }
            return true;
        }
        return false;
    }
    
    public java.lang.Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.entityId!=null?this.entityId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return suppressName;
        }
        if(propertyIndex==2)
        {
            return suppressAddress;
        }
        if(propertyIndex==3)
        {
            return suppressEmail;
        }
        if(propertyIndex==4)
        {
            return suppressPhone;
        }
        if(propertyIndex==5)
        {
            return suppressPersonal;
        }
        if(propertyIndex==6)
        {
            return this.versionNumber!=null?this.versionNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.objectId!=null?this.objectId:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "entityId";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "suppressName";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "suppressAddress";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "suppressEmail";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "suppressPhone";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "suppressPersonal";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "versionNumber";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "objectId";
            info.namespace= "http://rice.kuali.org/kim/v2_0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

