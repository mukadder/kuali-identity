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

public class VEFExistsSubQueryType extends VEFabstractPredicate implements KvmSerializable
{

    
    public VEFAndType and;
    
    public VEFEqualType equal;
    
    public VEFEqualIgnoreCaseType equalIgnoreCase;
    
    public VEFExistsSubQueryType existsSubQuery;
    
    public VEFGreaterThanType greaterThan;
    
    public VEFGreaterThanOrEqualType greaterThanOrEqual;
    
    public VEFInType in;
    
    public VEFInIgnoreCaseType inIgnoreCase;
    
    public VEFLessThanType lessThan;
    
    public VEFLessThanOrEqualType lessThanOrEqual;
    
    public VEFLikeType like;
    
    public VEFLikeIgnoreCaseType likeIgnoreCase;
    
    public VEFNotEqualType notEqual;
    
    public VEFNotEqualIgnoreCaseType notEqualIgnoreCase;
    
    public VEFNotInType notIn;
    
    public VEFNotInIgnoreCaseType notInIgnoreCase;
    
    public VEFNotLikeIgnoreCaseType notLikeIgnoreCase;
    
    public VEFNotLikeType notLike;
    
    public VEFNotNullType notNull;
    
    public VEFNullType null;
    
    public VEFOrType or;
    
    public String subQueryType;
    

    
    
    @Override
    public void loadFromSoap(java.lang.Object paramObj,VEFExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        super.loadFromSoap(paramObj, __envelope);
        if (inObj.hasAttribute("subQueryType"))
        {	
            java.lang.Object j = inObj.getAttribute("subQueryType");
            if (j != null)
            {
                subQueryType = j.toString();
            }
        }

    }

    @Override
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,VEFExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("and"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.and = (VEFAndType)__envelope.get(j,VEFAndType.class,false);
            }
            return true;
        }
        if (info.name.equals("equal"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.equal = (VEFEqualType)__envelope.get(j,VEFEqualType.class,false);
            }
            return true;
        }
        if (info.name.equals("equalIgnoreCase"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.equalIgnoreCase = (VEFEqualIgnoreCaseType)__envelope.get(j,VEFEqualIgnoreCaseType.class,false);
            }
            return true;
        }
        if (info.name.equals("existsSubQuery"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.existsSubQuery = (VEFExistsSubQueryType)__envelope.get(j,VEFExistsSubQueryType.class,false);
            }
            return true;
        }
        if (info.name.equals("greaterThan"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.greaterThan = (VEFGreaterThanType)__envelope.get(j,VEFGreaterThanType.class,false);
            }
            return true;
        }
        if (info.name.equals("greaterThanOrEqual"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.greaterThanOrEqual = (VEFGreaterThanOrEqualType)__envelope.get(j,VEFGreaterThanOrEqualType.class,false);
            }
            return true;
        }
        if (info.name.equals("in"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.in = (VEFInType)__envelope.get(j,VEFInType.class,false);
            }
            return true;
        }
        if (info.name.equals("inIgnoreCase"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.inIgnoreCase = (VEFInIgnoreCaseType)__envelope.get(j,VEFInIgnoreCaseType.class,false);
            }
            return true;
        }
        if (info.name.equals("lessThan"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.lessThan = (VEFLessThanType)__envelope.get(j,VEFLessThanType.class,false);
            }
            return true;
        }
        if (info.name.equals("lessThanOrEqual"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.lessThanOrEqual = (VEFLessThanOrEqualType)__envelope.get(j,VEFLessThanOrEqualType.class,false);
            }
            return true;
        }
        if (info.name.equals("like"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.like = (VEFLikeType)__envelope.get(j,VEFLikeType.class,false);
            }
            return true;
        }
        if (info.name.equals("likeIgnoreCase"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.likeIgnoreCase = (VEFLikeIgnoreCaseType)__envelope.get(j,VEFLikeIgnoreCaseType.class,false);
            }
            return true;
        }
        if (info.name.equals("notEqual"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.notEqual = (VEFNotEqualType)__envelope.get(j,VEFNotEqualType.class,false);
            }
            return true;
        }
        if (info.name.equals("notEqualIgnoreCase"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.notEqualIgnoreCase = (VEFNotEqualIgnoreCaseType)__envelope.get(j,VEFNotEqualIgnoreCaseType.class,false);
            }
            return true;
        }
        if (info.name.equals("notIn"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.notIn = (VEFNotInType)__envelope.get(j,VEFNotInType.class,false);
            }
            return true;
        }
        if (info.name.equals("notInIgnoreCase"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.notInIgnoreCase = (VEFNotInIgnoreCaseType)__envelope.get(j,VEFNotInIgnoreCaseType.class,false);
            }
            return true;
        }
        if (info.name.equals("notLikeIgnoreCase"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.notLikeIgnoreCase = (VEFNotLikeIgnoreCaseType)__envelope.get(j,VEFNotLikeIgnoreCaseType.class,false);
            }
            return true;
        }
        if (info.name.equals("notLike"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.notLike = (VEFNotLikeType)__envelope.get(j,VEFNotLikeType.class,false);
            }
            return true;
        }
        if (info.name.equals("notNull"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.notNull = (VEFNotNullType)__envelope.get(j,VEFNotNullType.class,false);
            }
            return true;
        }
        if (info.name.equals("null"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.null = (VEFNullType)__envelope.get(j,VEFNullType.class,false);
            }
            return true;
        }
        if (info.name.equals("or"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.or = (VEFOrType)__envelope.get(j,VEFOrType.class,false);
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
            return and;
        }
        if(propertyIndex==count+1)
        {
            return equal;
        }
        if(propertyIndex==count+2)
        {
            return equalIgnoreCase;
        }
        if(propertyIndex==count+3)
        {
            return existsSubQuery;
        }
        if(propertyIndex==count+4)
        {
            return greaterThan;
        }
        if(propertyIndex==count+5)
        {
            return greaterThanOrEqual;
        }
        if(propertyIndex==count+6)
        {
            return in;
        }
        if(propertyIndex==count+7)
        {
            return inIgnoreCase;
        }
        if(propertyIndex==count+8)
        {
            return lessThan;
        }
        if(propertyIndex==count+9)
        {
            return lessThanOrEqual;
        }
        if(propertyIndex==count+10)
        {
            return like;
        }
        if(propertyIndex==count+11)
        {
            return likeIgnoreCase;
        }
        if(propertyIndex==count+12)
        {
            return notEqual;
        }
        if(propertyIndex==count+13)
        {
            return notEqualIgnoreCase;
        }
        if(propertyIndex==count+14)
        {
            return notIn;
        }
        if(propertyIndex==count+15)
        {
            return notInIgnoreCase;
        }
        if(propertyIndex==count+16)
        {
            return notLikeIgnoreCase;
        }
        if(propertyIndex==count+17)
        {
            return notLike;
        }
        if(propertyIndex==count+18)
        {
            return notNull;
        }
        if(propertyIndex==count+19)
        {
            return null;
        }
        if(propertyIndex==count+20)
        {
            return or;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+21;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = VEFAndType.class;
            info.name = "and";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+1)
        {
            info.type = VEFEqualType.class;
            info.name = "equal";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+2)
        {
            info.type = VEFEqualIgnoreCaseType.class;
            info.name = "equalIgnoreCase";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+3)
        {
            info.type = VEFExistsSubQueryType.class;
            info.name = "existsSubQuery";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+4)
        {
            info.type = VEFGreaterThanType.class;
            info.name = "greaterThan";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+5)
        {
            info.type = VEFGreaterThanOrEqualType.class;
            info.name = "greaterThanOrEqual";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+6)
        {
            info.type = VEFInType.class;
            info.name = "in";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+7)
        {
            info.type = VEFInIgnoreCaseType.class;
            info.name = "inIgnoreCase";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+8)
        {
            info.type = VEFLessThanType.class;
            info.name = "lessThan";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+9)
        {
            info.type = VEFLessThanOrEqualType.class;
            info.name = "lessThanOrEqual";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+10)
        {
            info.type = VEFLikeType.class;
            info.name = "like";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+11)
        {
            info.type = VEFLikeIgnoreCaseType.class;
            info.name = "likeIgnoreCase";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+12)
        {
            info.type = VEFNotEqualType.class;
            info.name = "notEqual";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+13)
        {
            info.type = VEFNotEqualIgnoreCaseType.class;
            info.name = "notEqualIgnoreCase";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+14)
        {
            info.type = VEFNotInType.class;
            info.name = "notIn";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+15)
        {
            info.type = VEFNotInIgnoreCaseType.class;
            info.name = "notInIgnoreCase";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+16)
        {
            info.type = VEFNotLikeIgnoreCaseType.class;
            info.name = "notLikeIgnoreCase";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+17)
        {
            info.type = VEFNotLikeType.class;
            info.name = "notLike";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+18)
        {
            info.type = VEFNotNullType.class;
            info.name = "notNull";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+19)
        {
            info.type = VEFNullType.class;
            info.name = "null";
            info.namespace= "http://rice.kuali.org/core/v2_0";
        }
        if(propertyIndex==count+20)
        {
            info.type = VEFOrType.class;
            info.name = "or";
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
            info.name = "subQueryType";
            info.namespace= "";
            if(this.subQueryType!=null)
            {
                info.setValue(this.subQueryType);
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

