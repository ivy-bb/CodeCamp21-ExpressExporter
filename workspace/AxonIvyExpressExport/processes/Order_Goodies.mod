[Ivy]
18004555B2817C8C 9.3.1 #module
>Proto >Proto Collection #zClass
Os0 Order_Goodies Big #zClass
Os0 B #cInfo
Os0 #process
Os0 @AnnotationInP-0n ai ai #zField
Os0 @TextInP .type .type #zField
Os0 @TextInP .processKind .processKind #zField
Os0 @TextInP .xml .xml #zField
Os0 @TextInP .responsibility .responsibility #zField
Os0 @StartRequest f0 '' #zField
Os0 @UserTask f1 '' #zField
Os0 @TkArc f2 '' #zField
Os0 @TaskSwitch f3 '' #zField
Os0 @TkArc f4 '' #zField
Os0 @UserTask f5 '' #zField
Os0 @TkArc f6 '' #zField
Os0 @TaskSwitch f7 '' #zField
Os0 @TkArc f8 '' #zField
Os0 @UserTask f9 '' #zField
Os0 @TkArc f10 '' #zField
Os0 @TkArc f11 '' #zField
Os0 @UserTask f12 '' #zField
Os0 @TkArc f13 '' #zField
Os0 @EndTask f14 '' #zField
Os0 @PushWFArc f15 '' #zField
>Proto Os0 Os0 Order_Goodies #zField
Os0 f0 outLink 'start_Order Goodies.ivp' #txt
Os0 f0 inParamDecl '<> param;' #txt
Os0 f0 requestEnabled true #txt
Os0 f0 triggerEnabled false #txt
Os0 f0 callSignature start() #txt
Os0 f0 startName 'Order Goodies' #txt
Os0 f0 caseData 'businessCase.attach=true
case.name=Order Goodies
customFields.STRING.embedInFrame="True"
customFields.STRING.steps="Order,Check,Final Review"' #txt
Os0 f0 wfuser 1 #txt
Os0 f0 roleExceptionId '>> Ignore Exception' #txt
Os0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>startOrder Goodies.ivp</name>
        <desc>Order Goodies</desc>
    </language>
</elementInfo>
' #txt
Os0 f0 @C|.responsibility Everybody #txt
Os0 f0 81 113 30 30 -61 17 #rect
Os0 f1 dialogId axon.ivy.express.export.TaskDialog #txt
Os0 f1 startMethod start(axon.ivy.express.export.Order_GoodiesData) #txt
Os0 f1 requestActionDecl '<axon.ivy.express.export.Order_GoodiesData data> param;' #txt
Os0 f1 requestMappingAction 'param.data=in;
' #txt
Os0 f1 responseMappingAction 'out=result.data;
' #txt
Os0 f1 taskData 'TaskA.DESC=Select your goods
TaskA.EXP=new Duration(0,0,1,0,0,0)
TaskA.NAM=Order
TaskA.ROL="Everybody"
TaskA.SKIP_TASK_LIST=true
TaskA.TYPE=2
TaskA.customFields.NUMBER.parallelindex=0
TaskA.customFields.NUMBER.stepindex=0' #txt
Os0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Order</name>
    </language>
</elementInfo>
' #txt
Os0 f1 168 106 112 44 -15 -8 #rect
Os0 f2 111 128 168 128 #arcP
Os0 f3 actionTable 'out=in1;
' #txt
Os0 f3 outLinks "TaskB.ivp","TaskA.ivp" #txt
Os0 f3 taskData 'TaskB.NAM=SYSTEM ch.ivyteam.ivy.process.model.diagram.value.Label@66df04a
TaskB.ROL=SYSTEM
TaskB.TYPE=0
TaskA.NAM=SYSTEM ch.ivyteam.ivy.process.model.diagram.value.Label@66df04a
TaskA.ROL=SYSTEM
TaskA.TYPE=0' #txt
Os0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>split</name>
    </language>
</elementInfo>
' #txt
Os0 f3 336 112 32 32 -11 18 #rect
Os0 f4 var in1 #txt
Os0 f4 280 128 336 128 #arcP
Os0 f5 dialogId axon.ivy.express.export.TaskDialog #txt
Os0 f5 startMethod start(axon.ivy.express.export.Order_GoodiesData) #txt
Os0 f5 requestActionDecl '<axon.ivy.express.export.Order_GoodiesData data> param;' #txt
Os0 f5 requestMappingAction 'param.data=in;
' #txt
Os0 f5 responseMappingAction 'out=result.data;
' #txt
Os0 f5 taskData 'TaskA.DESC=Check and approve. Set delivery date.
TaskA.EXP=new Duration(0,0,1,0,0,0)
TaskA.NAM=Check
TaskA.ROL="\#demo"
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=2
TaskA.customFields.NUMBER.parallelindex=0
TaskA.customFields.NUMBER.stepindex=1' #txt
Os0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Check</name>
    </language>
</elementInfo>
' #txt
Os0 f5 424 58 112 44 -17 -8 #rect
Os0 f6 expr data #txt
Os0 f6 outCond ivp=="TaskA.ivp" #txt
Os0 f6 364 124 424 101 #arcP
Os0 f7 actionTable 'out=in1;
out.order=in1.order;
out.check=in1.check;
out.check2=in2.check2;
' #txt
Os0 f7 outLinks "TaskA.ivp" #txt
Os0 f7 taskData 'TaskA.NAM=SYSTEM ch.ivyteam.ivy.process.model.diagram.value.Label@a7d71a72
TaskA.ROL=SYSTEM
TaskA.TYPE=0' #txt
Os0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>join</name>
    </language>
</elementInfo>
' #txt
Os0 f7 592 112 32 32 -10 18 #rect
Os0 f8 var in1 #txt
Os0 f8 536 101 596 124 #arcP
Os0 f9 dialogId axon.ivy.express.export.TaskDialog #txt
Os0 f9 startMethod start(axon.ivy.express.export.Order_GoodiesData) #txt
Os0 f9 requestActionDecl '<axon.ivy.express.export.Order_GoodiesData data> param;' #txt
Os0 f9 requestMappingAction 'param.data=in;
' #txt
Os0 f9 responseMappingAction 'out=result.data;
' #txt
Os0 f9 taskData 'TaskA.DESC=Check and approve. Set delivery date.
TaskA.EXP=new Duration(0,0,1,0,0,0)
TaskA.NAM=Check
TaskA.ROL="\#admin"
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=2
TaskA.customFields.NUMBER.parallelindex=1
TaskA.customFields.NUMBER.stepindex=1' #txt
Os0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Check</name>
    </language>
</elementInfo>
' #txt
Os0 f9 424 154 112 44 -17 -8 #rect
Os0 f10 expr data #txt
Os0 f10 outCond ivp=="TaskB.ivp" #txt
Os0 f10 364 132 424 155 #arcP
Os0 f11 var in2 #txt
Os0 f11 536 155 596 132 #arcP
Os0 f12 dialogId axon.ivy.express.export.TaskDialog #txt
Os0 f12 startMethod start(axon.ivy.express.export.Order_GoodiesData) #txt
Os0 f12 requestActionDecl '<axon.ivy.express.export.Order_GoodiesData data> param;' #txt
Os0 f12 requestMappingAction 'param.data=in;
' #txt
Os0 f12 responseMappingAction 'out=result.data;
' #txt
Os0 f12 taskData 'TaskA.NAM=Order Goodies\: Final Review
TaskA.ROL=CREATOR
TaskA.TYPE=0
TaskA.customFields.NUMBER.stepindex=2' #txt
Os0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Final Review</name>
        <desc>Exported AxonIvyExpress Workflow Order Goodies</desc>
    </language>
</elementInfo>
' #txt
Os0 f12 680 106 112 44 -35 -8 #rect
Os0 f13 expr data #txt
Os0 f13 outCond ivp=="TaskA.ivp" #txt
Os0 f13 624 128 680 128 #arcP
Os0 f14 849 113 30 30 0 15 #rect
Os0 f15 792 128 849 128 #arcP
>Proto Os0 .type axon.ivy.express.export.Order_GoodiesData #txt
>Proto Os0 .processKind NORMAL #txt
>Proto Os0 0 0 32 24 18 0 #rect
>Proto Os0 @|BIcon #fIcon
Os0 f0 mainOut f2 tail #connect
Os0 f2 head f1 in #connect
Os0 f1 out f4 tail #connect
Os0 f4 head f3 in #connect
Os0 f3 out f6 tail #connect
Os0 f6 head f5 in #connect
Os0 f5 out f8 tail #connect
Os0 f8 head f7 in #connect
Os0 f3 out f10 tail #connect
Os0 f10 head f9 in #connect
Os0 f9 out f11 tail #connect
Os0 f11 head f7 in #connect
Os0 f7 out f13 tail #connect
Os0 f13 head f12 in #connect
Os0 f12 out f15 tail #connect
Os0 f15 head f14 mainIn #connect
