package com.example.testSoap.wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.2.8.3
//
// Created by Quasar Development 
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class VEFEntityType_entityTypeContactInfos extends Vector< VEFEntityTypeContactInfoType> implements KvmSerializable
{
    private transient java.lang.Object __source;

    public void loadFromSoap(java.lang.Object inObj,VEFExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        __source=inObj;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                VEFEntityTypeContactInfoType j1= (VEFEntityTypeContactInfoType)__envelope.get(j,VEFEntityTypeContactInfoType.class,false);
                add(j1);
            }
        }
}
    public java.lang.Object getSourceObject()
    {
        return __source;
    }
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "entityTypeContactInfo";
        info.type = VEFEntityTypeContactInfoType.class;
    	info.namespace= "http://rice.kuali.org/kim/v2_0";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    
}