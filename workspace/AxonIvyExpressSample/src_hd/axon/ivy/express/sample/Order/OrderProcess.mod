[Ivy]
17F7977B176B3341 9.3.1 #module
>Proto >Proto Collection #zClass
Gs0 OrderProcess Big #zClass
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
Gs0 @UdExitEnd f4 '' #zField
Gs0 @UdEvent f3 '' #zField
Gs0 @PushWFArc f5 '' #zField
>Proto Gs0 Gs0 OrderProcess #zField
Gs0 f0 guid 17F6513AE7E23EF2 #txt
Gs0 f0 method start(axon.ivy.express.sample.Order.OrderData) #txt
Gs0 f0 inParameterDecl '<axon.ivy.express.sample.Order.OrderData data> param;' #txt
Gs0 f0 inParameterMapAction 'out.After_Shave_Balm=param.data.After_Shave_Balm;
out.Delivery_Address=param.data.Delivery_Address;
out.Lip_Gloss=param.data.Lip_Gloss;
out.Some_remarks=param.data.Some_remarks;
' #txt
Gs0 f0 outParameterDecl '<axon.ivy.express.sample.Order.OrderData dataOut> result;' #txt
Gs0 f0 outParameterMapAction 'result.dataOut.After_Shave_Balm=in.After_Shave_Balm;
result.dataOut.Delivery_Address=in.Delivery_Address;
result.dataOut.Lip_Gloss=in.Lip_Gloss;
result.dataOut.Some_remarks="done";
' #txt
Gs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start</name>
    </language>
</elementInfo>
' #txt
Gs0 f0 83 51 26 26 -10 23 #rect
Gs0 f1 211 51 26 26 0 12 #rect
Gs0 f2 109 64 211 64 #arcP
Gs0 f4 211 147 26 26 0 12 #rect
Gs0 f3 guid 17FC174762F8A186 #txt
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
Gs0 f5 109 160 211 160 #arcP
>Proto Gs0 .type axon.ivy.express.sample.Order.OrderData #txt
>Proto Gs0 .processKind HTML_DIALOG #txt
>Proto Gs0 -8 -8 16 16 16 26 #rect
Gs0 f0 mainOut f2 tail #connect
Gs0 f2 head f1 mainIn #connect
Gs0 f3 mainOut f5 tail #connect
Gs0 f5 head f4 mainIn #connect
