[Ivy]
17F6513AE7893014 9.3.1 #module
>Proto >Proto Collection #zClass
Gs0 Give_your_orderProcess Big #zClass
Gs0 RD #cInfo
Gs0 #process
Gs0 @AnnotationInP-0n ai ai #zField
Gs0 @TextInP .type .type #zField
Gs0 @TextInP .processKind .processKind #zField
Gs0 @TextInP .xml .xml #zField
Gs0 @TextInP .responsibility .responsibility #zField
Gs0 @UdInit f0 '' #zField
Gs0 @UdProcessEnd f1 '' #zField
Gs0 @PushWFArc f2 '' #zField
Gs0 @UdEvent f3 '' #zField
Gs0 @UdExitEnd f4 '' #zField
Gs0 @PushWFArc f5 '' #zField
>Proto Gs0 Gs0 Give_your_orderProcess #zField
Gs0 f0 guid 17F6513AE7E23EF2 #txt
Gs0 f0 method start(axon.ivy.express.sample.Get_your_Goodies_Data) #txt
Gs0 f0 inParameterDecl '<axon.ivy.express.sample.Get_your_Goodies_Data data> param;' #txt
Gs0 f0 inParameterMapAction 'out.check_goods_on_stock=param.data.check_goods_on_stock;
out.give_your_order=param.data.give_your_order;
' #txt
Gs0 f0 outParameterDecl '<axon.ivy.express.sample.Get_your_Goodies_Data data> result;' #txt
Gs0 f0 outParameterMapAction 'result.data.give_your_order=in.give_your_order;
' #txt
Gs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Get_your_Goodies_Data)</name>
    </language>
</elementInfo>
' #txt
Gs0 f0 83 51 26 26 -84 15 #rect
Gs0 f1 211 51 26 26 0 12 #rect
Gs0 f2 109 64 211 64 #arcP
Gs0 f3 guid 17F6513AE86B2C34 #txt
Gs0 f3 actionTable 'out=in;
' #txt
Gs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Gs0 f3 83 147 26 26 -15 15 #rect
Gs0 f4 211 147 26 26 0 12 #rect
Gs0 f5 109 160 211 160 #arcP
>Proto Gs0 .type axon.ivy.express.sample.Give_your_order.Give_your_orderData #txt
>Proto Gs0 .processKind HTML_DIALOG #txt
>Proto Gs0 -8 -8 16 16 16 26 #rect
Gs0 f0 mainOut f2 tail #connect
Gs0 f2 head f1 mainIn #connect
Gs0 f3 mainOut f5 tail #connect
Gs0 f5 head f4 mainIn #connect
