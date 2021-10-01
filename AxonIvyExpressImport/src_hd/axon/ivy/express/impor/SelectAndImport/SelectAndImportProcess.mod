[Ivy]
17C36BBF58E53CD7 9.3.0 #module
>Proto >Proto Collection #zClass
Ss0 SelectAndImportProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @UdInit f0 '' #zField
Ss0 @UdProcessEnd f1 '' #zField
Ss0 @PushWFArc f2 '' #zField
Ss0 @UdEvent f3 '' #zField
Ss0 @UdExitEnd f4 '' #zField
Ss0 @GridStep f6 '' #zField
Ss0 @PushWFArc f5 '' #zField
Ss0 @ErrorBoundaryEvent f8 '' #zField
Ss0 @GridStep f9 '' #zField
Ss0 @PushWFArc f10 '' #zField
Ss0 @UdProcessEnd f11 '' #zField
Ss0 @PushWFArc f12 '' #zField
Ss0 @Alternative f13 '' #zField
Ss0 @PushWFArc f14 '' #zField
Ss0 @PushWFArc f16 '' #zField
Ss0 @PushWFArc f15 '' #zField
>Proto Ss0 Ss0 SelectAndImportProcess #zField
Ss0 f0 guid 17C36BBF5981870E #txt
Ss0 f0 method start() #txt
Ss0 f0 inParameterDecl '<> param;' #txt
Ss0 f0 outParameterDecl '<> result;' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ss0 f0 83 51 26 26 -16 15 #rect
Ss0 f1 211 51 26 26 0 12 #rect
Ss0 f2 109 64 211 64 #arcP
Ss0 f3 guid 17C36BBF5A2D00FF #txt
Ss0 f3 actionTable 'out=in;
' #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Ss0 f3 83 147 26 26 -15 15 #rect
Ss0 f4 435 147 26 26 0 12 #rect
Ss0 f6 actionTable 'out=in;
' #txt
Ss0 f6 actionCode 'import ch.ivyteam.ivy.scripting.exceptions.IvyScriptException;
import ch.ivyteam.ivy.ExpressWorkflowImporter;

ExpressWorkflowImporter.importJson(in.jsonFile);

' #txt
Ss0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>import json</name>
    </language>
</elementInfo>
' #txt
Ss0 f6 264 138 112 44 -31 -8 #rect
Ss0 f5 376 160 435 160 #arcP
Ss0 f8 actionTable 'out=in;
' #txt
Ss0 f8 attachedToRef 17C36BBF58E53CD7-f6 #txt
Ss0 f8 337 177 30 30 0 15 #rect
Ss0 f9 actionTable 'out=in;
' #txt
Ss0 f9 actionCode 'import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_ERROR, "Nothing to import", null));' #txt
Ss0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ERROR MSG</name>
    </language>
</elementInfo>
' #txt
Ss0 f9 384 234 112 44 -36 -8 #rect
Ss0 f10 364 201 440 234 #arcP
Ss0 f10 0 0.7723804333947666 0 0 #arcLabel
Ss0 f11 531 243 26 26 0 12 #rect
Ss0 f12 496 256 531 256 #arcP
Ss0 f13 176 144 32 32 0 16 #rect
Ss0 f14 109 160 176 160 #arcP
Ss0 f16 expr in #txt
Ss0 f16 outCond !in.jsonFile.getName().endsWith(".json") #txt
Ss0 f16 192 176 384 256 #arcP
Ss0 f16 1 192 256 #addKink
Ss0 f15 expr in #txt
Ss0 f15 208 160 264 160 #arcP
>Proto Ss0 .type axon.ivy.express.impor.SelectAndImport.SelectAndImportData #txt
>Proto Ss0 .processKind HTML_DIALOG #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
Ss0 f0 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f6 mainOut f5 tail #connect
Ss0 f5 head f4 mainIn #connect
Ss0 f8 mainOut f10 tail #connect
Ss0 f10 head f9 mainIn #connect
Ss0 f9 mainOut f12 tail #connect
Ss0 f12 head f11 mainIn #connect
Ss0 f3 mainOut f14 tail #connect
Ss0 f14 head f13 in #connect
Ss0 f13 out f16 tail #connect
Ss0 f16 head f9 mainIn #connect
Ss0 f13 out f15 tail #connect
Ss0 f15 head f6 mainIn #connect
